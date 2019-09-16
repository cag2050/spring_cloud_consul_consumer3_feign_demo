package com.example.spring_cloud_consul_consumer3_feign_demo.controller;

import com.example.spring_cloud_consul_consumer3_feign_demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping("/hello1")
    public String hello() {
        return helloService.hello();
    }
}