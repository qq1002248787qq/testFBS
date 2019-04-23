package com.fh.user.controller;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableDubbo
public class DubboControllerStarter {

    public static void main(String[] args) {
        SpringApplication.run(DubboControllerStarter.class,args);

    }
    @Bean
    public ApplicationConfig applicationConfig(){

        ApplicationConfig applicationConfig = new ApplicationConfig("testUser");

        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();

        registryConfig.setAddress("zookeeper://zookeeper.qfjava.cn:8601?backup=zookeeper.qfjava.cn:8602,zookeeper.qfjava.cn:8603");

        return  registryConfig;
    }

}
