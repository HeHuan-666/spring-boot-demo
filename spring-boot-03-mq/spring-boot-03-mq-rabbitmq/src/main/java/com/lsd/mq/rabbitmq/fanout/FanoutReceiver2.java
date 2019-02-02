package com.lsd.mq.rabbitmq.fanout;

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
@RabbitListener(queues = "fanout.B")
public class FanoutReceiver2 {
    @RabbitHandler
    public void process(MessageEntity messageEntity) {
        System.out.println("fanout.B 接收消息：" + messageEntity);
    }
}
