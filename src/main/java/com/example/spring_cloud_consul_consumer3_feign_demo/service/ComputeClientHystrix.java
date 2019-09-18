package com.example.spring_cloud_consul_consumer3_feign_demo.service;

public class ComputeClientHystrix implements IComputeClient {

    @Override
    public Integer add(Integer a, Integer b) {
        return -9999;
    }
}
