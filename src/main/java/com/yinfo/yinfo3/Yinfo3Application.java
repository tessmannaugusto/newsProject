package com.yinfo.yinfo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Yinfo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Yinfo3Application.class, args);
	}

}
