package com.lsd.mq.rabbitmq.many;

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
public class ManySender1 {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(Long i) {
        MessageEntity messageEntity = new MessageEntity(i);
        System.out.println("1号发送者：" + messageEntity);
        this.rabbitTemplate.convertAndSend("hello", messageEntity);
    }
}
