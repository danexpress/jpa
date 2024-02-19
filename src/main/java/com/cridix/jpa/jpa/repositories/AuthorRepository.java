package com.cridix.jpa.jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.cridix.jpa.jpa.Models.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer>, JpaSpecificationExecutor<Author> {
    // update Author a set a.age =22 where a.id = 1
    @Transactional
    List<Author> findByNamedQuery(@Param("age") int age);

    @Modifying
    @Transactional
    @Query("update Author a set a.age = :age where a.id = :id")
    int updateAuthor(int age, int id);

    @Modifying
    @Transactional
    @Query("update Author a set a.age = :age")
    void updateAllAuthorsAge(int age);

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
