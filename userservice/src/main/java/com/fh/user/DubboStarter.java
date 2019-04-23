package com.fh.user;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo//自动扫描项目下的dubbo配置和注解
//@DubboComponentScan(basePackages = "com.fh.user.*")同上
@SpringBootApplication
public class DubboStarter {
    public static void main(String[] args) {
        SpringApplication.run(DubboStarter.class,args);
    }
}
