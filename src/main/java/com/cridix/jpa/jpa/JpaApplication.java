package com.cridix.jpa.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.domain.Specification;

import com.cridix.jpa.jpa.Models.Author;
import com.cridix.jpa.jpa.Models.Video;
import com.cridix.jpa.jpa.repositories.AuthorRepository;
import com.cridix.jpa.jpa.repositories.VideoRepository;
import com.cridix.jpa.jpa.specification.AuthorSpecification;
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

			// update author with ID = 1
			var author = Author.builder()
					.id(1)
					.firstname("cridix")
					.lastname("doe")
					.age(24)
					.email("contact@topmail.com")
					.build();

			// repository.updateAuthor(22, 1);
			// update all autyors
			// repository.updateAllAuthorsAge(99);
			// repository.findByNamedQuery(60)
			// .forEach(System.out::println);

			Specification<Author> spec = Specification
					.where(AuthorSpecification.hasAge(99))
					.and(AuthorSpecification.firstnameLike("i"));
			repository.findAll(spec).forEach(System.out::println);
		};
	}

}
