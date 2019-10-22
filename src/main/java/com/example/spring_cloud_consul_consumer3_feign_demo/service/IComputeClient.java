package com.example.spring_cloud_consul_consumer3_feign_demo.service;

import com.example.spring_cloud_consul_consumer3_feign_demo.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-producer", configuration = FeignConfig.class, fallback = ComputeClientHystrix.class)
public interface IComputeClient {
    @RequestMapping("/add")
    Integer add(@RequestParam Integer a, @RequestParam Integer b);
}
