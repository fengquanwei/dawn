package com.fengquanwei.dawn.eureka.client.consumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Hystrix 服务
 *
 * @author fengquanwei
 * @create 2019/4/14 16:17
 **/
@Service
public class HystrixService {
    private static final Logger logger = LoggerFactory.getLogger(HystrixService.class);

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String hello() {
        long start = System.currentTimeMillis();

        String responseBody = restTemplate.getForEntity("http://MY-EUREKA-CLIENT-PROVIDER/hello", String.class).getBody();

        long end = System.currentTimeMillis();

        logger.info("hello, hystrix invoke stat, start: {}, end: {}, cost: {}", start, end, end - start);

        return responseBody;
    }

    public String helloFallback() {
        return "服务器繁忙，请稍后重试";
    }
}
