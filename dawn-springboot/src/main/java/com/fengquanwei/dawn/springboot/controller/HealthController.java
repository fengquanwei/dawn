package com.fengquanwei.dawn.springboot.controller;

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
    @RequestMapping("/check")
    public String check() {
        return "success";
    }
}
