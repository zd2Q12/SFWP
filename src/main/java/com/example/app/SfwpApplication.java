package com.example.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.example.app.mapper")
@SpringBootApplication
public class SfwpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfwpApplication.class, args);
	}

}
