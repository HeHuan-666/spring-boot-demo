package com.lsd.mq.rabbitmq.topic;

import com.lsd.mq.rabbitmq.model.MessageEntity;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: lishengdong
 * @create: 2019/2/2 09:18
 */
@Component
@RabbitListener(queues = "topic.messages")
public class TopicReceiver2 {
    @RabbitHandler
    public void process(MessageEntity messageEntity) {
        System.out.println("topic.messages 接收消息：" + messageEntity);
    }
}
