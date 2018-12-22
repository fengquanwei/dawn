package com.fengquanwei.dawn.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 健康检查
 *
 * @author fengquanwei
 * @create 2018/12/22 16:53
 **/
@RestController
@RequestMapping("/health")
public class HealthController {
    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${key.name}")
    private String name;
    @Value("${key.email}")
    private String email;

    @RequestMapping("/check")
    public String check() {
        return "success";
    }

    @RequestMapping("/who")
    public String who() {
        return "【" + applicationName + "】" + name + "/" + email;
    }
}
