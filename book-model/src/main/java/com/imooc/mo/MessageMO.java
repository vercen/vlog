package com.imooc.mo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document("message")
public class MessageMO {

    @Id
    private String id;                  // 消息主键id

    @Field("fromUserId")
    private String fromUserId;          // 消息来自的用户id
    @Field("fromNickname")
    private String fromNickname;        // 消息来自的用户昵称
    @Field("fromFace")
    private String fromFace;            // 消息来自的用户头像

    @Field("toUserId")
    private String toUserId;            // 消息发送到某对象的用户id

    @Field("msgType")
    private Integer msgType;             // 消息类型 枚举
    @Field("msgContent")
    private Map msgContent;              // 消息内容

    @Field("createTime")
    private Date createTime;            // 消息创建时间
}
