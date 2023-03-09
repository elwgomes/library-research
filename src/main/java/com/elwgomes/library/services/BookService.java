package com.elwgomes.library.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elwgomes.library.entities.Book;
import com.elwgomes.library.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository repository;

	public List<Book> findAll () {
		return repository.findAll(); 
	}

	public Book findById (Long id) {
		Optional<Book> obj = repository.findById(id);		
		return obj.get();
	}
}
