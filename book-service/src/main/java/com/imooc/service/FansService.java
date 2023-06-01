package com.imooc.service;

import com.imooc.utils.PagedGridResult;

public interface FansService {

    /**
     * 关注
     */
    public void doFollow(String myId, String vlogerId);

    /**
     * 取关
     */
    public void doCancel(String myId, String vlogerId);

    /**
     * 查询用户是否关注博主
     */
    public boolean queryDoIFollowVloger(String myId, String vlogerId);

    /**
     * 查询我关注的博主列表
     */
    public PagedGridResult queryMyFollows(String myId,
                                           Integer page,
                                           Integer pageSize);

    /**
     * 查询我的粉丝列表
     */
    public PagedGridResult queryMyFans(String myId,
                                          Integer page,
                                          Integer pageSize);
}
