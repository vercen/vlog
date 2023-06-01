package com.imooc.pojo;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;

public class Fans {
    @Id
    private String id;

    /**
     * 作家用户id
     */
    @Column(name = "vloger_id")
    private String vlogerId;

    /**
     * 粉丝用户id
     */
    @Column(name = "fan_id")
    private String fanId;

    /**
     * 粉丝是否是vloger的朋友，如果成为朋友，则本表的双方此字段都需要设置为1，如果有一人取关，则两边都需要设置为0
     */
    @Column(name = "is_fan_friend_of_mine")
    private Integer isFanFriendOfMine;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取作家用户id
     *
     * @return vloger_id - 作家用户id
     */
    public String getVlogerId() {
        return vlogerId;
    }

    /**
     * 设置作家用户id
     *
     * @param vlogerId 作家用户id
     */
    public void setVlogerId(String vlogerId) {
        this.vlogerId = vlogerId;
    }

    /**
     * 获取粉丝用户id
     *
     * @return fan_id - 粉丝用户id
     */
    public String getFanId() {
        return fanId;
    }

    /**
     * 设置粉丝用户id
     *
     * @param fanId 粉丝用户id
     */
    public void setFanId(String fanId) {
        this.fanId = fanId;
    }

    /**
     * 获取粉丝是否是vloger的朋友，如果成为朋友，则本表的双方此字段都需要设置为1，如果有一人取关，则两边都需要设置为0
     *
     * @return is_fan_friend_of_mine - 粉丝是否是vloger的朋友，如果成为朋友，则本表的双方此字段都需要设置为1，如果有一人取关，则两边都需要设置为0
     */
    public Integer getIsFanFriendOfMine() {
        return isFanFriendOfMine;
    }

    /**
     * 设置粉丝是否是vloger的朋友，如果成为朋友，则本表的双方此字段都需要设置为1，如果有一人取关，则两边都需要设置为0
     *
     * @param isFanFriendOfMine 粉丝是否是vloger的朋友，如果成为朋友，则本表的双方此字段都需要设置为1，如果有一人取关，则两边都需要设置为0
     */
    public void setIsFanFriendOfMine(Integer isFanFriendOfMine) {
        this.isFanFriendOfMine = isFanFriendOfMine;
    }
}