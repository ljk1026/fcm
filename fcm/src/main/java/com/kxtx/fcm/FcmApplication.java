package com.kxtx.fcm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = {"com.kxtx.fcm"})
@MapperScan(basePackages = "com.kxtx.fcm.dao")
public class FcmApplication {

	public static void main(String[] args) {
		SpringApplication.run(FcmApplication.class, args);
	}
}
