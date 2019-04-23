package com.crystal.light;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
//Mybatis包扫描
@MapperScan("com.crystal.light.dao")
//开启事务
@EnableTransactionManagement
//开启定时任务
@EnableScheduling
public class LightApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(LightApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(LightApplication.class);
    }
}
