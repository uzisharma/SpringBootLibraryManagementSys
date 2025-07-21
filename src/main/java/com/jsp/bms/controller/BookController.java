package com.jsp.bms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsp.bms.entity.Book;
import com.jsp.bms.repository.BookRepository;

@Controller
public class BookController {
	@Autowired
	BookRepository br; //creating the BookRepository interface object as it contains all the DAO methods, like save()
	
	@ResponseBody
	@GetMapping("/savebook")
	public Book saveBook(@RequestBody Book book) {
		Book savedBook = br.save(book); //we will return the same object back to the postman
		return savedBook;
	}
	
	@ResponseBody
	@GetMapping("/find-all-books")
	public List<Book> findAllBooks(){
		return br.findAll();
	}

}
