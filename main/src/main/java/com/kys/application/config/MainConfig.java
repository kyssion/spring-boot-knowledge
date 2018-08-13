package com.kys.application.config;

import com.kys.application.bean.MainTestBean;
import com.kys.application.properties.MainPropertiesBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MainPropertiesBean.class)
public class MainConfig {
    @Autowired
    MainPropertiesBean mainPropertiesBean;
    @Bean
    MainTestBean mainTestBean(){
        return new MainTestBean(mainPropertiesBean.getName(),mainPropertiesBean.getAge());
    }
}
