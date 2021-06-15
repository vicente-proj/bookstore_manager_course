package com.vicente.bookstoremanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vicente.bookstoremanager.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
