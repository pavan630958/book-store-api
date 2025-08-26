package com.excelr.bookstore.services;

import java.util.List;



import com.excelr.bookstore.entity.Book;

public interface BookServices {
	Book saveBook(Book book);
	List<Book> findAllBook();
	Book updateBook(Long bid, Book book);
	String deleteBook(Long bid);
	Book findBookById(Long bid);
	
}
