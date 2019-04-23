package com.fh.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fh.user.service.IUservice;


@Service
public class UserServiceImpl implements IUservice {

    @Override
    public String getName(String name) {
        return "月薪过万："+name;
    }
}
