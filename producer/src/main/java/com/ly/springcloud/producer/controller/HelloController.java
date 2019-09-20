package com.ly.springcloud.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/")
    public String hello(String name){
        return "Hello "+name+",当前时间： "+new Date();
    }
}
