package com.notifications.microserviceproject;

import com.notifications.microserviceproject.service.EmployeeDescriptionService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroserviceprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceprojectApplication.class, args);
	}
	EmployeeDescriptionService obj;


}
