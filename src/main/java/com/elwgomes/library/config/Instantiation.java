package com.elwgomes.library.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.elwgomes.library.entities.Book;
import com.elwgomes.library.repositories.BookRepository;

@Configuration
@Profile(value = "test")
public class Instantiation implements CommandLineRunner{

	@Autowired
	private BookRepository bookRepository;

	public void run (String... args) {

	Book b1 = new Book(null, "Harry Potter", "J K Rowling", "lorem");

	bookRepository.saveAll(Arrays.asList(b1));

	}

}
