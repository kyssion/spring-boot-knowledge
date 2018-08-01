package com.kys.application;

import com.kys.application.bean.MainTestBean;
import com.kys.starter.bean.StarterTestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {
    @Autowired
    MainTestBean mainPropertiesBean;
    @Autowired
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
