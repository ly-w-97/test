package com.ly.springcloud.consumer.controller;

import com.ly.springcloud.consumer.service.HelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    HelloFeign helloFeign;
    @RequestMapping("/")
    public String hello(@RequestParam(value = "name") String name){
        return "This is Feign,"+helloFeign.hello(name);
    }
}
