package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(Demo1Application.class, args);
	Employee emp = context.getBean(Employee.class);
	emp.show(); 
	// This is just a sample
	///  This is third commit
	}
}
