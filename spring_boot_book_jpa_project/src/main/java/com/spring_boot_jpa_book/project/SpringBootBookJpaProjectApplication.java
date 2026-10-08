package com.spring_boot_jpa_book.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.spring_boot_jpa_book.project"})
public class SpringBootBookJpaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBookJpaProjectApplication.class, args);
	}
}
