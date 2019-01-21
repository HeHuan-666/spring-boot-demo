package com.lsd.quick.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: RESTfull API简单项目的快速搭建
 * @author: lishengdong
 * @create: 2019/1/21 15:45
 */
@RestController
public class HelloController {
    /**
     * 访问：http://localhost:8080/hello
     * @return
     */
    @RequestMapping("/hello")
    public String hello() {
        return "hello world quick!";
    }
}
