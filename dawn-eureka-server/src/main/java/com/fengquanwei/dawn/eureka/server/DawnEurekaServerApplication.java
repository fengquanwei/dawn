package com.fengquanwei.dawn.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 启动服务注册中心
public class DawnEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DawnEurekaServerApplication.class, args);
    }

}

