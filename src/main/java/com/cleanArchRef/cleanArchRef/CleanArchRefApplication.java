package com.cleanArchRef.cleanArchRef;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.cleanArchRef.infrastructure.database")
@EntityScan("com.cleanArchRef.infrastructure.database")
@ComponentScan(basePackages = "com.cleanArchRef")
public class CleanArchRefApplication {

	public static void main(String[] args) {
		SpringApplication.run(CleanArchRefApplication.class, args);
	}

}
