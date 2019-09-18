package com.example.spring_cloud_consul_consumer3_feign_demo.controller;

import com.example.spring_cloud_consul_consumer3_feign_demo.service.IHelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    IHelloClient iHelloClient;

    @RequestMapping("/hello")
    public String hello() {
        return iHelloClient.hello();
    }
}
