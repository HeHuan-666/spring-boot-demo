package com.lsd.mq.rabbitmq;

import com.lsd.mq.rabbitmq.many.ManySender1;
import com.lsd.mq.rabbitmq.many.ManySender2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description:
 * @author: lishengdong
 * @create: 2019/2/2 09:20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyTest {
    @Autowired
    private ManySender1 manySender1;

    @Autowired
    private ManySender2 manySender2;

    @Test
    public void oneToMany() {
        for (int i = 0; i < 100; i++) {
            manySender1.send((long) i);
        }
    }

    @Test
    public void manyToMany() {
        for (int i = 0; i < 100; i++) {
            manySender1.send((long) i);
            manySender2.send((long) i);
        }
    }
}
