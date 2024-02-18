package com.cridix.jpa.jpa.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Author {

    @Id
    private Integer id;

    private String firstname;

    private String lastname;

    private String email;

    private int age;

}
