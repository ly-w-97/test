package com.ly.springcloud.consumer.service.error;

import com.ly.springcloud.consumer.service.HelloFeign;

public class HelloFeignErro implements HelloFeign {
    @Override
    public String hello(String name) {
        return "sorry,"+name+" I have a error!";
    }
}
