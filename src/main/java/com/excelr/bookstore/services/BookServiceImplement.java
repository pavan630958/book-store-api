package com.excelr.bookstore.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.excelr.bookstore.entity.Book;
import com.excelr.bookstore.exception.NotFoundException;
import com.excelr.bookstore.repository.BookRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class BookServiceImplement implements BookServices{
	private final BookRepository bookRepository;
	
	@Override
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public List<Book> findAllBook() {
		return bookRepository.findAll();
	}

	@Override
	public Book updateBook(Long bid, Book book) {
		 Book existingBook = findBookById(bid);
		 existingBook.setBookTitle(book.getBookTitle());
		 existingBook.setBookAuthor(book.getBookAuthor());
		 existingBook.setPrice(book.getPrice());
		 existingBook.setIsbn(book.getIsbn());
		    return bookRepository.save( existingBook);
	}

	@Override
	public String deleteBook(Long bid) {
		 if (!bookRepository.existsById(bid)) throw new NotFoundException("Book not found: " + bid);
		    bookRepository.deleteById(bid);
		    return "Deleted Successfully by Id " + bid;
	}

	@Override
	public Book findBookById(Long bid) {
		 return bookRepository.findById(bid).orElseThrow(() -> new NotFoundException("Book not found: " + bid));
	}

}
