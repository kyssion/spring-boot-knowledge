package com.kys.application;

import com.kys.application.bean.MainTestBean;
import com.kys.starter.bean.StarterTestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;
import javax.naming.Name;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {
    @Autowired
    MainTestBean mainPropertiesBean;

    @Resource(name = "two")
    StarterTestBean starterTestBean;
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(mainPropertiesBean.getAge()+" "+mainPropertiesBean.getName());
        System.out.println(starterTestBean.getAge()+" "+starterTestBean.getName());
    }
}
