package com.bookstore.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String isbn;
    private double price;
    private String genre;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}
