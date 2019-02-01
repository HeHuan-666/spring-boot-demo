package com.lsd.mq.rabbitmq;

import com.lsd.mq.rabbitmq.hello.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description:
 * @author: lishengdong
 * @create: 2019/2/1 15:52
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloTest {
    @Autowired
    private HelloSender helloSender;

    @Test
    public void hello() throws Exception {
        helloSender.send();
    }
}
