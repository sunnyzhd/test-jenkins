package com.example.jenkinstest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ZhangDong
 * @Date 2020/9/1 11:04
 */
@RestController
@RequestMapping("webhook")
public class WebHookController {

    @PostMapping("notify")
    public Object hookNotify(){
        System.out.println("webhook notify");
        return "success";
    }

    @GetMapping("test")
    public Object test(){
        return "";
    }
}
