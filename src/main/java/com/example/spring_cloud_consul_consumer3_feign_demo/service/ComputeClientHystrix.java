package com.example.spring_cloud_consul_consumer3_feign_demo.service;

import org.springframework.stereotype.Component;

// 需要添加注解：@Component，注入到Ioc容器中；否则报错：No fallback instance of type class xxx found for feign client xxx
@Component
public class ComputeClientHystrix implements IComputeClient {

    @Override
    public Integer add(Integer a, Integer b) {
        return -9999;
    }
}
