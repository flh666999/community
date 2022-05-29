package com.nowcoder.community.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

@Configuration
public class AlfaConfig {
    @Bean
    public SimpleDateFormat simpleDateFormat(){
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    }
}
