package com.jms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class IbmmqDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbmmqDemoApplication.class, args);
	}
	
	 
}
