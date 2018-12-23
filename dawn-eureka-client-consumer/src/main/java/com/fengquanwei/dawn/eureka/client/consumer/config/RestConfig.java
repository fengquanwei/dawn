package com.fengquanwei.dawn.eureka.client.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestConfig
 *
 * @author fengquanwei
 * @create 2018/12/23 13:01
 **/
@Configuration
public class RestConfig {
    @Bean
    @LoadBalanced // 通过 Ribbon 实现客户端负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
