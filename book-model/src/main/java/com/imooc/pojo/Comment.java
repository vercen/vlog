package com.imooc.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Comment {
    @Id
    private String id;

    /**
     * 评论的视频是哪个作者（vloger）的关联id
     */
    @Column(name = "vloger_id")
    private String vlogerId;

    /**
     * 如果是回复留言，则本条为子留言，需要关联查询
     */
    @Column(name = "father_comment_id")
    private String fatherCommentId;

    /**
     * 回复的那个视频id
     */
    @Column(name = "vlog_id")
    private String vlogId;

    /**
     * 发布留言的用户id
     */
    @Column(name = "comment_user_id")
    private String commentUserId;

    /**
     * 留言内容
     */
    private String content;

    /**
     * 留言的点赞总数
     */
    @Column(name = "like_counts")
    private Integer likeCounts;

    /**
     * 留言时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 获取评论的视频是哪个作者（vloger）的关联id
     *
     * @return vloger_id - 评论的视频是哪个作者（vloger）的关联id
     */
    public String getVlogerId() {
        return vlogerId;
    }

    /**
     * 设置评论的视频是哪个作者（vloger）的关联id
     *
     * @param vlogerId 评论的视频是哪个作者（vloger）的关联id
     */
    public void setVlogerId(String vlogerId) {
        this.vlogerId = vlogerId;
    }

    /**
     * 获取如果是回复留言，则本条为子留言，需要关联查询
     *
     * @return father_comment_id - 如果是回复留言，则本条为子留言，需要关联查询
     */
    public String getFatherCommentId() {
        return fatherCommentId;
    }

    /**
     * 设置如果是回复留言，则本条为子留言，需要关联查询
     *
     * @param fatherCommentId 如果是回复留言，则本条为子留言，需要关联查询
     */
    public void setFatherCommentId(String fatherCommentId) {
        this.fatherCommentId = fatherCommentId;
    }

    /**
     * 获取回复的那个视频id
     *
     * @return vlog_id - 回复的那个视频id
     */
    public String getVlogId() {
        return vlogId;
    }

    /**
     * 设置回复的那个视频id
     *
     * @param vlogId 回复的那个视频id
     */
    public void setVlogId(String vlogId) {
        this.vlogId = vlogId;
    }

    /**
     * 获取发布留言的用户id
     *
     * @return comment_user_id - 发布留言的用户id
     */
    public String getCommentUserId() {
        return commentUserId;
    }

    /**
     * 设置发布留言的用户id
     *
     * @param commentUserId 发布留言的用户id
     */
    public void setCommentUserId(String commentUserId) {
        this.commentUserId = commentUserId;
    }

    /**
     * 获取留言内容
     *
     * @return content - 留言内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置留言内容
     *
     * @param content 留言内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取留言的点赞总数
     *
     * @return like_counts - 留言的点赞总数
     */
    public Integer getLikeCounts() {
        return likeCounts;
    }

    /**
     * 设置留言的点赞总数
     *
     * @param likeCounts 留言的点赞总数
     */
    public void setLikeCounts(Integer likeCounts) {
        this.likeCounts = likeCounts;
    }

    /**
     * 获取留言时间
     *
     * @return create_time - 留言时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置留言时间
     *
     * @param createTime 留言时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}