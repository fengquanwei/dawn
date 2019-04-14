package com.fengquanwei.dawn.eureka.client.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // 启动服务治理客户端
@EnableCircuitBreaker // 启动断路器
public class DawnEurekaClientConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DawnEurekaClientConsumerApplication.class, args);
    }

}

