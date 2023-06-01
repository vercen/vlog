package com.imooc.controller;

import com.imooc.base.BaseInfoProperties;
import com.imooc.bo.RegistLoginBO;
import com.imooc.grace.result.GraceJSONResult;
import com.imooc.grace.result.ResponseStatusEnum;
import com.imooc.pojo.Users;
import com.imooc.service.UserService;
import com.imooc.utils.IPUtil;
import com.imooc.utils.SMSUtils;
import com.imooc.vo.UsersVO;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.UUID;

/**
 * @author vercen
 * @version 1.0
 * @date 2023/5/25 10:47
 */
@Slf4j
@RestController
@RequestMapping("passport")
@Api(tags = "通行证，验证码登录注册")
public class PassportController extends BaseInfoProperties {
    @Autowired
    SMSUtils smsUtils;
    @Autowired
    UserService userService;
    @PostMapping("getSMSCode")
    public Object getSMSCode(@RequestParam String mobile, HttpServletRequest request) throws Exception {
        if (StringUtils.isBlank(mobile)){
            return GraceJSONResult.ok();
        }

        //TODO 获得用户ip 限制时间60s只能1次
        String userIp=IPUtil.getRequestIp(request);

        redis.setnx60s(MOBILE_SMSCODE+":"+userIp, userIp);
        String code=(int)((Math.random()*9+1)*100000)+"";

        smsUtils.sendSMS(mobile,code);

        log.info(code);
        redis.set(MOBILE_SMSCODE+":"+mobile, code,30*60);
        //TODO 验证码放入redis
        return GraceJSONResult.ok();
    }

    @PostMapping("login")
    public Object login(@Valid @RequestBody RegistLoginBO registLoginBO){

        String rediscode = redis.get(MOBILE_SMSCODE + ":" + registLoginBO.getMobile());

        if (StringUtils.isBlank(rediscode)|| !rediscode.equalsIgnoreCase(registLoginBO.getSmsCode())){
            System.out.println("rediscode"+rediscode);
            System.out.println("registLoginBO.getMobile()"+registLoginBO.getSmsCode());
            return GraceJSONResult.errorCustom(ResponseStatusEnum.SMS_CODE_ERROR);
        }

        Users user = userService.queryMobileIsExist(registLoginBO.getMobile());
        if (user==null){
            user = userService.createUser(registLoginBO.getMobile());
        }
        String uToken = UUID.randomUUID().toString();
        redis.set(REDIS_USER_TOKEN+":"+user.getId(),uToken);

        //清除验证码
        redis.del(MOBILE_SMSCODE+":"+user.getMobile());

        //返回给前端
        UsersVO usersVO = new UsersVO();
        BeanUtils.copyProperties(user, usersVO);
        usersVO.setUserToken(uToken);

        return GraceJSONResult.ok(usersVO);

    }

    @PostMapping("logout")
    public Object logout(@RequestParam String userId){

        redis.del(REDIS_USER_TOKEN+":"+userId);

        return GraceJSONResult.ok();
    }

}
