package com.cridix.jpa.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cridix.jpa.jpa.Models.Author;
import com.cridix.jpa.jpa.Models.Video;
import com.cridix.jpa.jpa.repositories.AuthorRepository;
import com.cridix.jpa.jpa.repositories.VideoRepository;
import com.github.javafaker.Faker;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository repository, VideoRepository videoRepository) {
		return args -> {
			// for (int i = 0; i < 50; i++) {
			// Faker faker = new Faker();
			// var author = Author.builder()
			// .firstname(faker.name().firstName())
			// .lastname(faker.name().lastName())
			// .age(faker.number().numberBetween(19, 50))
			// .email("contact" + i + "@mail.com")
			// .build();
			// repository.save(author);
			// }
			// var video = Video.builder()
			// .name("abc")
			// .length(5)
			// .build();
			// videoRepository.save(video);
		};
	}

}
