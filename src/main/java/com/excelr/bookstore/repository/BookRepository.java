package com.excelr.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelr.bookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	
}
