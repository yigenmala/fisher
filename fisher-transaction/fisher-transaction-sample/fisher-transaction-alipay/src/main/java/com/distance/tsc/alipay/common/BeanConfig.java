package com.distance.tsc.alipay.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public IdWorker idWorker(){
        return new IdWorker();
    }



}
