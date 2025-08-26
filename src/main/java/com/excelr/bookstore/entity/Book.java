package com.excelr.bookstore.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Entity
@Data
@Table(name="books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bid;
	@NotBlank(message = "book title is mandatory")
	private String bookTitle;
	@NotBlank(message = "book author is mandatory")
	private String bookAuthor;
	 @Positive(message = "Price must be positive")
	private BigDecimal price;

	 @NotBlank(message = "ISBN is mandatory")
	 @Pattern(regexp = "^(\\d{10}|\\d{13})$", message = "ISBN must be 10 or 13 digits")
	 @Column(unique = true, length = 13) 
	private String isbn; //here isbn means International Standard Book Number for unique identification

}
