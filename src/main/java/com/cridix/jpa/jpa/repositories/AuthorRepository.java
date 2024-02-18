package com.cridix.jpa.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cridix.jpa.jpa.Models.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
