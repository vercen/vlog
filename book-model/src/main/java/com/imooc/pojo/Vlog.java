package com.imooc.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Vlog {
    @Id
    private String id;

    /**
     * 对应用户表id，vlog视频发布者
     */
    @Column(name = "vloger_id")
    private String vlogerId;

    /**
     * 视频播放地址
     */
    private String url;

    /**
     * 视频封面
     */
    private String cover;

    /**
     * 视频标题，可以为空
     */
    private String title;

    /**
     * 视频width
     */
    private Integer width;

    /**
     * 视频height
     */
    private Integer height;

    /**
     * 点赞总数
     */
    @Column(name = "like_counts")
    private Integer likeCounts;

    /**
     * 评论总数
     */
    @Column(name = "comments_counts")
    private Integer commentsCounts;

    /**
     * 是否私密，用户可以设置私密，如此可以不公开给比人看
     */
    @Column(name = "is_private")
    private Integer isPrivate;

    /**
     * 创建时间 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 更新时间 更新时间
     */
    @Column(name = "updated_time")
    private Date updatedTime;

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
     * 获取对应用户表id，vlog视频发布者
     *
     * @return vloger_id - 对应用户表id，vlog视频发布者
     */
    public String getVlogerId() {
        return vlogerId;
    }

    /**
     * 设置对应用户表id，vlog视频发布者
     *
     * @param vlogerId 对应用户表id，vlog视频发布者
     */
    public void setVlogerId(String vlogerId) {
        this.vlogerId = vlogerId;
    }

    /**
     * 获取视频播放地址
     *
     * @return url - 视频播放地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置视频播放地址
     *
     * @param url 视频播放地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取视频封面
     *
     * @return cover - 视频封面
     */
    public String getCover() {
        return cover;
    }

    /**
     * 设置视频封面
     *
     * @param cover 视频封面
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * 获取视频标题，可以为空
     *
     * @return title - 视频标题，可以为空
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置视频标题，可以为空
     *
     * @param title 视频标题，可以为空
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取视频width
     *
     * @return width - 视频width
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * 设置视频width
     *
     * @param width 视频width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * 获取视频height
     *
     * @return height - 视频height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * 设置视频height
     *
     * @param height 视频height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * 获取点赞总数
     *
     * @return like_counts - 点赞总数
     */
    public Integer getLikeCounts() {
        return likeCounts;
    }

    /**
     * 设置点赞总数
     *
     * @param likeCounts 点赞总数
     */
    public void setLikeCounts(Integer likeCounts) {
        this.likeCounts = likeCounts;
    }

    /**
     * 获取评论总数
     *
     * @return comments_counts - 评论总数
     */
    public Integer getCommentsCounts() {
        return commentsCounts;
    }

    /**
     * 设置评论总数
     *
     * @param commentsCounts 评论总数
     */
    public void setCommentsCounts(Integer commentsCounts) {
        this.commentsCounts = commentsCounts;
    }

    /**
     * 获取是否私密，用户可以设置私密，如此可以不公开给比人看
     *
     * @return is_private - 是否私密，用户可以设置私密，如此可以不公开给比人看
     */
    public Integer getIsPrivate() {
        return isPrivate;
    }

    /**
     * 设置是否私密，用户可以设置私密，如此可以不公开给比人看
     *
     * @param isPrivate 是否私密，用户可以设置私密，如此可以不公开给比人看
     */
    public void setIsPrivate(Integer isPrivate) {
        this.isPrivate = isPrivate;
    }

    /**
     * 获取创建时间 创建时间
     *
     * @return created_time - 创建时间 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间 创建时间
     *
     * @param createdTime 创建时间 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取更新时间 更新时间
     *
     * @return updated_time - 更新时间 更新时间
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置更新时间 更新时间
     *
     * @param updatedTime 更新时间 更新时间
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}