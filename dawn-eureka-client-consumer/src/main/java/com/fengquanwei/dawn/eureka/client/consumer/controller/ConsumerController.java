package com.fengquanwei.dawn.eureka.client.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 服务消费者
 *
 * @author fengquanwei
 * @create 2018/12/23 13:00
 **/
@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String hello() {
        return restTemplate.getForEntity("http://MY-EUREKA-CLIENT-PROVIDER/hello", String.class).getBody();
    }
}
