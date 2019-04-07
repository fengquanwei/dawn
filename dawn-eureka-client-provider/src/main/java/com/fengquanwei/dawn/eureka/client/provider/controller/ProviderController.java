package com.fengquanwei.dawn.eureka.client.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();

        logger.info("hello, serviceId: {}, host: {}, port: {}", serviceInstance.getServiceId(), serviceInstance.getHost(), serviceInstance.getPort());

        return "hello world";
    }
}
