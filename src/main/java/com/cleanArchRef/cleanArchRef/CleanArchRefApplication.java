package com.cleanArchRef.cleanArchRef;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.cleanArchRef.infrastructure.database.user.repositories")
@EntityScan("com.cleanArchRef.infrastructure.database.user.models")
public class CleanArchRefApplication {

	public static void main(String[] args) {
		SpringApplication.run(CleanArchRefApplication.class, args);
	}

}
