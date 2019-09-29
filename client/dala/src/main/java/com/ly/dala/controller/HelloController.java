package com.ly.dala.controller;


import com.ly.dala.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {

    private final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService){
        this.helloService = helloService;
    }

    @RequestMapping("/")
    @ResponseBody
    public String hello(@RequestParam("name")String name,@RequestParam("id")int id){
        return helloService.hello(id)+name;
    }
}
