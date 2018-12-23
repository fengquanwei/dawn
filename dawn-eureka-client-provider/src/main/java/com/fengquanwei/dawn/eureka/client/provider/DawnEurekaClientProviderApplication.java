package com.fengquanwei.dawn.eureka.client.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // 激活 DiscoveryClient
public class DawnEurekaClientProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DawnEurekaClientProviderApplication.class, args);
    }

}

