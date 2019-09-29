package com.ly.dala.service.impl;

import com.ly.dala.entity.User;
import com.ly.dala.mapper.HelloMapper;
import com.ly.dala.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    private final HelloMapper helloMapper;

    @Autowired
    public HelloServiceImpl(HelloMapper helloMapper){
        this.helloMapper = helloMapper;
    }
    @Override
    public User hello(int id){
        return helloMapper.selectUserById(id);
    }
}
