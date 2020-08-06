package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		DemoApplication da = new DemoApplication();
		da.print();
	}

	public void print() {
		System.out.println("test 1234");
	}

}
