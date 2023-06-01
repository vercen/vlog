package com.imooc.service;

import com.imooc.bo.UpdatedUserBO;
import com.imooc.pojo.Users;

/**
 * @author vercen
 * @version 1.0
 * @date 2023/5/25 21:02
 */
public interface UserService {
    /**
     * 判断用户是否存在，如果存在则返回用户信息
     */
    public Users queryMobileIsExist(String mobile);


    /**
     * 创建用户信息，并且返回用户对象
     */
    public Users createUser(String mobile);

    /**
     * 根据用户主键查询用户信息
     */
    public Users getUser(String userId);

    /**
     * 用户信息修改
     */
    public Users updateUserInfo(UpdatedUserBO updatedUserBO);

    /**
     * 用户信息修改
     */
    public Users updateUserInfo(UpdatedUserBO updatedUserBO, Integer type);

}
