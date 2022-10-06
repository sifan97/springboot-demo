package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

public class FeignConfig {
    //注意引入的logger的包是feign的
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
