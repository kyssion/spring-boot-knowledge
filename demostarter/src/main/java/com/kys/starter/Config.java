package com.kys.starter;

import com.kys.starter.bean.StarterTestBean;
import com.kys.starter.properties.StarterProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
@EnableConfigurationProperties(StarterProperties.class)
@ConditionalOnClass(StarterTestBean.class)
public class Config {

    @Bean(name = "name")
    String name(){
        return "this is name";
    }

    @Bean(name = "one")
    @ConditionalOnProperty(prefix = "properties.starter",value = "enabled",havingValue = "true")
    StarterTestBean getStarterBean(StarterProperties starterProperties){
        return new StarterTestBean(starterProperties.getName(),starterProperties.getAge());
    }

    @Bean(name = "two")
    @ConditionalOnProperty(prefix = "properties.starter",value = "enabled",havingValue = "true")
    StarterTestBean getStarterBean2(@Qualifier("name") String name,StarterProperties starterProperties){
        return new StarterTestBean(name,starterProperties.getAge());
    }
}
