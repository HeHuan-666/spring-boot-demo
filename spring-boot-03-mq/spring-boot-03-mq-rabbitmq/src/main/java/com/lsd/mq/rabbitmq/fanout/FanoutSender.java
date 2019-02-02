package com.lsd.mq.rabbitmq.fanout;

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
public class FanoutSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        MessageEntity messageEntity = new MessageEntity();
        System.out.println("发送者：" + messageEntity);
        this.rabbitTemplate.convertAndSend("fanoutExchange", "", messageEntity);
    }
}
