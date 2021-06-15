package com.vicente.com.br.bookstoremanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vicente.com.br.bookstoremanager.dto.MessageResponseDTO;
import com.vicente.com.br.bookstoremanager.entity.Book;
import com.vicente.com.br.bookstoremanager.repository.BookRepository;

@Service
public class BookService {

private BookRepository bookRepository;
	
	@Autowired
	public void BookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public MessageResponseDTO create(Book book) {
		Book bookSave = bookRepository.save(book);
		return MessageResponseDTO.builder().message("Livro criado com o id"+ bookSave.getId()).build();
	}
}
