package com.yj.springboot2hello.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title HelloController
 * @author YangJian
 * @version 1.0.0
 * @create 2025/4/10 19:46
 * @description <TODO description class purpose>
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
