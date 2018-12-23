package com.fengquanwei.dawn.eureka.client.provider.controller;

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
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/hello")
    public String world() {
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();

        System.out.println("host: " + serviceInstance.getHost());
        System.out.println("serviceId: " + serviceInstance.getServiceId());

        return "hello world";
    }
}
