package com.example.jenkinstest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ZhangDong
 * @Date 2020/8/31 16:52
 */
@RestController
@RequestMapping("")
public class LoginController {

    @GetMapping("ping")
    public Object ping(){
        return "pong";
    }
}
