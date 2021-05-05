package com.companyname.springbootcrudrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootCrudRest2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudRest2Application.class, args);
	}

}
