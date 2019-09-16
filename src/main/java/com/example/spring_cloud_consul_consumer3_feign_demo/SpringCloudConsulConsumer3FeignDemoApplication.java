package com.example.spring_cloud_consul_consumer3_feign_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringCloudConsulConsumer3FeignDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsulConsumer3FeignDemoApplication.class, args);
    }

}
