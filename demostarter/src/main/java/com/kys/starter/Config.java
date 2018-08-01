package com.kys.starter;

import com.kys.starter.bean.StarterTestBean;
import com.kys.starter.properties.StarterProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(StarterProperties.class)
@ConditionalOnClass(StarterTestBean.class)
public class Config {
    @Autowired
    StarterProperties starterProperties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "properties.starter",value = "enabled",havingValue = "true")
    StarterTestBean getStarterBean(){
        return new StarterTestBean(starterProperties.getName(),starterProperties.getAge());
    }
}
