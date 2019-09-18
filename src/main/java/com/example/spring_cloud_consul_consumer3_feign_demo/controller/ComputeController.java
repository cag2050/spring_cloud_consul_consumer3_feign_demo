package com.example.spring_cloud_consul_consumer3_feign_demo.controller;

import com.example.spring_cloud_consul_consumer3_feign_demo.service.ComputeClientHystrix;
import com.example.spring_cloud_consul_consumer3_feign_demo.service.IComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputeController {

    @Autowired
    IComputeClient iComputeClient;

    @RequestMapping("/add")
    Integer add() {
        return iComputeClient.add(20, 10);
    }
}
