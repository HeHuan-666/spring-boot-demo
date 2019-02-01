package com.lsd.mq.rabbitmq.hello;

import com.lsd.mq.rabbitmq.model.MessageEntity;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @description:
 * @author: lishengdong
 * @create: 2019/2/1 15:47
 */
@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        MessageEntity messageEntity = new MessageEntity();
        System.out.println("发送消息：" + messageEntity);
        this.rabbitTemplate.convertAndSend("hello", messageEntity);
    }
}
