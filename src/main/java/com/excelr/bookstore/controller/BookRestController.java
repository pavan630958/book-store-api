package com.excelr.bookstore.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.bookstore.entity.Book;
import com.excelr.bookstore.services.BookServices;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookRestController {
	private final BookServices bookServices;
	@PostMapping("/add")
	public ResponseEntity<String> add(@Valid @RequestBody Book book){
		bookServices.saveBook(book);
		return new ResponseEntity<String>("Book added Successfully!", HttpStatus.CREATED);
	}
	@GetMapping("/getAll")
	public ResponseEntity<List<Book>> getAllBookEntity(){
		return ResponseEntity.ok(bookServices.findAllBook());
	}
	
	@GetMapping("/{id}")
	 public ResponseEntity<Book> getByBookId(@PathVariable Long id) {
		    return ResponseEntity.ok(bookServices.findBookById(id));
	 }
	@PutMapping("/update/{id}")
	 
	  public ResponseEntity<String> update(@PathVariable Long id, @Valid @RequestBody Book book) {
	    bookServices.updateBook(id, book);
	    return ResponseEntity.ok("Book updated successfully");
	  }
	
	@DeleteMapping("/delete/{id}")
	  
	  public ResponseEntity<String> delete(@PathVariable Long id) {
	    return ResponseEntity.ok(bookServices.deleteBook(id));
	  }
}
