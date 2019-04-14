package com.fengquanwei.dawn.eureka.client.consumer.controller;

import com.fengquanwei.dawn.eureka.client.consumer.service.HystrixService;
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
    @Autowired
    private HystrixService hystrixService;

    @RequestMapping("/hello")
    public String hello() {
        return restTemplate.getForEntity("http://MY-EUREKA-CLIENT-PROVIDER/hello", String.class).getBody();
    }

    @RequestMapping("/helloWithHystrix")
    public String helloWithHystrix() {
        return hystrixService.hello();
    }
}
