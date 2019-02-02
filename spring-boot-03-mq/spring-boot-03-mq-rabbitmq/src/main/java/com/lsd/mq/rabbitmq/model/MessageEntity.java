package com.lsd.mq.rabbitmq.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @author: lishengdong
 * @create: 2019/2/1 15:09
 */
public class MessageEntity implements Serializable {
    private static final long serialVersionUID = 4336349265657011531L;

    //消息编号
    private Long messgeId;

    //消息内容
    private String context;

    public MessageEntity() {
        this.messgeId = System.currentTimeMillis();
        this.context = "消息内容，时间戳为：" + new Date();
    }

    public MessageEntity(Long messgeId) {
        this.messgeId = messgeId;
        this.context = "消息内容，时间戳为：" + new Date();
    }

    public MessageEntity(Long messgeId, String context) {
        this.messgeId = messgeId;
        this.context = context;
    }

    public Long getMessgeId() {
        return messgeId;
    }

    public void setMessgeId(Long messgeId) {
        this.messgeId = messgeId;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "MessageEntity{" +
                "messgeId=" + messgeId +
                ", context=" + context +
                '}';
    }
}
