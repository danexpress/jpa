package com.cridix.jpa.jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cridix.jpa.jpa.Models.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    // // select * from author where first_name = 'ali'
    // List<Author> findAllbyFirstName(String firstName);

    // // select * from author where first_name = 'al'
    // List<Author> findAllByFirstNameIgnoreCase(String firstName);

    // // select * from author where first_name like '%al%'
    // List<Author> findAllByFirstNameContainingIgnoreCase(String firstName);

    // // select * from author where first_name like 'al%'
    // List<Author> findAllByFirstNameStartingWithIgnoreCase(String firstName);

    // // select * from author where first_name like '%al'
    // List<Author> findAllByFirstNameEndsWithIgnoreCase(String firstName);

    // // select * from author where first_name in ('fred', 'vic', 'coding')
    // List<Author> findAllByFirstNameInIgnoreCase(List<String> firstName);
}
