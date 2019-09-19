package com.ly.springcloud.consumer.service;

import com.ly.springcloud.consumer.service.error.HelloFeignErro;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hello",fallback = HelloFeignErro.class)
@Component
public interface HelloFeign {
    @RequestMapping("/hello/")
    String hello(@RequestParam(value = "name")String name);
}
