package com.lsd.mq.rabbitmq.topic;

import com.lsd.mq.rabbitmq.model.MessageEntity;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: lishengdong
 * @create: 2019/2/2 09:14
 */
@Component
public class TopicSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        MessageEntity messageEntity = new MessageEntity();
        System.out.println("topic.1 发送者：" + messageEntity);
        this.rabbitTemplate.convertAndSend("topicExchange", "topic.1", messageEntity);
    }

    public void send1() {
        MessageEntity messageEntity = new MessageEntity();
        System.out.println("topic.message 发送者：" + messageEntity);
        this.rabbitTemplate.convertAndSend("topicExchange", "topic.message", messageEntity);
    }

    public void send2() {
        MessageEntity messageEntity = new MessageEntity();
        System.out.println("topic.messages 发送者：" + messageEntity);
        this.rabbitTemplate.convertAndSend("topicExchange", "topic.messages", messageEntity);
    }
}
