package com.fengquanwei.dawn.eureka.client.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // 激活 DiscoveryClient
public class DawnEurekaClientConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DawnEurekaClientConsumerApplication.class, args);
    }

}

