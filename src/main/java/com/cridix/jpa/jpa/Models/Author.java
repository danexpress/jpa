package com.cridix.jpa.jpa.Models;

// import java.time.LocalDateTime;
import java.util.List;

// import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;

// import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity

// @Table(name = "AUTHOR_TBL")

public class Author extends BaseEntity {

    // @Id
    // @GeneratedValue
    // (strategy = GenerationType.SEQUENCE, generator = "author_sequence")
    // @SequenceGenerator(name = "author_sequence", sequenceName =
    // "author_sequence", allocationSize = 1)
    // private Integer id;

    @Column(name = "f_name")
    private String firstname;

    private String lastname;

    @Column(unique = true, nullable = false)
    private String email;

    private int age;

    // @Column(updatable = false, nullable = false)
    // @CreationTimestamp
    // private LocalDateTime createdAt;

    // @Column(insertable = false)
    // private LocalDateTime lastModified;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;

}
