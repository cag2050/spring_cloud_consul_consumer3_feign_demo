package com.example.spring_cloud_consul_consumer3_feign_demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("service-producer")
public interface IHelloClient {
    @RequestMapping("/hello")
    String hello();
}
