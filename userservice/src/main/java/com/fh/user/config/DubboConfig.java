package com.fh.user.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboConfig {

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

    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(23456);
        return protocolConfig;
    }

}
