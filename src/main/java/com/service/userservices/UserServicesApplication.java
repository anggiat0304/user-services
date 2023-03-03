package com.service.userservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class UserServicesApplication {


	public static void main(String[] args) {
		SpringApplication.run(UserServicesApplication.class, args);
	}

}
