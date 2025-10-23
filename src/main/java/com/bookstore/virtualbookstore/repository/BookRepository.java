package com.bookstore.virtualbookstore.repository;

import com.bookstore.virtualbookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
