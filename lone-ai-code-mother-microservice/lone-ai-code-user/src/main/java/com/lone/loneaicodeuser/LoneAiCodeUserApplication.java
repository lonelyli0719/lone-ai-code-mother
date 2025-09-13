package com.lone.loneaicodeuser;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.lone.loneaicodeuser.mapper")
@ComponentScan("com.lone")
@EnableDubbo
public class LoneAiCodeUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(LoneAiCodeUserApplication.class, args);
    }
}
