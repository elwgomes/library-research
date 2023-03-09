package com.elwgomes.library.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.elwgomes.library.entities.Book;
import com.elwgomes.library.services.BookService;

@RestController
@RequestMapping("/books")
@CrossOrigin
public class BookResource {

	@Autowired
	private BookService service;


	@GetMapping("/findAll")
	public ResponseEntity<List<Book>> findAll () {
		List<Book> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping 
	public ResponseEntity<Book> findById (@RequestParam Long id) {
		return service.findById(id);
	}

}
