package com.fengquanwei.dawn.eureka.client.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * 服务提供者
 *
 * @author fengquanwei
 * @create 2018/12/23 12:07
 **/
@RestController
public class ProviderController {
    private static final Logger logger = LoggerFactory.getLogger(ProviderController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/hello")
    public String hello() {
        int time = new Random().nextInt(2000);

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            logger.error("sleep error", e);
        }

        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();

        String serviceId = serviceInstance.getServiceId();
        String host = serviceInstance.getHost();
        int port = serviceInstance.getPort();

        logger.info("hello, I'am {}:{}:{}, I have slept for {} mills", serviceId, host, port, time);

        return "hello, I'am " + serviceId + ":" + host + ":" + port + ", I have slept for " + time + " mills";
    }
}
