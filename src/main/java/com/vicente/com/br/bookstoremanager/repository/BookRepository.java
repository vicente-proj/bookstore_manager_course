package com.vicente.com.br.bookstoremanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vicente.com.br.bookstoremanager.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
