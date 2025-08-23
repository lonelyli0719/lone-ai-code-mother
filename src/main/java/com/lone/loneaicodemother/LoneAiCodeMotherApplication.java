package com.lone.loneaicodemother;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
@MapperScan("com.lone.loneaicodemother.mapper")
public class LoneAiCodeMotherApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoneAiCodeMotherApplication.class, args);
	}

}
