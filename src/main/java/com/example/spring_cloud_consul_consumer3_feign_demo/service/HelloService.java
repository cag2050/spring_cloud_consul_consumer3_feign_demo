package com.example.spring_cloud_consul_consumer3_feign_demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "service-producer")
public interface HelloService {
    @RequestMapping("/hello")
    String hello();
}
