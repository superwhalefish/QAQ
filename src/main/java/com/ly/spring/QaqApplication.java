package com.ly.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.ly.spring.dao")
@MapperScan("com.ly.spring.dao")
public class QaqApplication {

	public static void main(String[] args) {
		SpringApplication.run(QaqApplication.class, args);
	}

}
