package com.cridix.jpa.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cridix.jpa.jpa.Models.Author;
import com.cridix.jpa.jpa.repositories.AuthorRepository;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	// @Bean
	CommandLineRunner commandLineRunner(AuthorRepository repository) {
		return args -> {
			var author = Author.builder()
					.firstname("Fred")
					.lastname("champ")
					.age(30)
					.email("contact@mail.com")
					.build();
			repository.save(author);
		};
	}

}
