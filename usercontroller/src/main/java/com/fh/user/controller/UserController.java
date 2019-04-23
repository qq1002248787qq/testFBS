package com.fh.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fh.user.service.IUservice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Reference//dubbo下的Reference 表示从zookeeper上面拿到引用
    private IUservice iUservice;
    @RequestMapping("/info")
    private String getAa(String name){
        return iUservice.getName(name);
    }
}
