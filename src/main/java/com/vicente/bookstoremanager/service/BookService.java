package com.vicente.bookstoremanager.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.vicente.bookstoremanager.dto.BookDTO;
import com.vicente.bookstoremanager.dto.MessageResponseDTO;
import com.vicente.bookstoremanager.entity.Book;
import com.vicente.bookstoremanager.mapper.BookMapper;
import com.vicente.bookstoremanager.repository.BookRepository;

@Service
public class BookService {

    private BookRepository bookRepository;

    private final BookMapper bookMapper = BookMapper.INSTANCE;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(BookDTO bookDTO) {
        Book bookToSave = bookMapper.toModel(bookDTO);

        Book savedBook = bookRepository.save(bookToSave);
        return MessageResponseDTO.builder()
                .message("Book created with ID " + savedBook.getId())
                .build();
    }
    
    public BookDTO findById(Long id) {
    	Optional<Book> bookOptional =  bookRepository.findById(id);
    	return bookMapper.toDTO(bookOptional.get());
    }

}