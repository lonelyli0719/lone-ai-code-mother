package com.lone.loneaicodemother;

import dev.langchain4j.community.store.embedding.redis.spring.RedisEmbeddingStoreAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(exclude = {RedisEmbeddingStoreAutoConfiguration.class})
@EnableAspectJAutoProxy(exposeProxy = true)
@MapperScan("com.lone.loneaicodemother.mapper")
public class LoneAiCodeMotherApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoneAiCodeMotherApplication.class, args);
	}

}
