package com.jsp.bms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsp.bms.entity.Book;
import com.jsp.bms.repository.BookRepository;

@Controller
public class BookController {
	@Autowired
	BookRepository br;
	
	@ResponseBody
	@RequestMapping("/savebook")
	public String saveBook(@RequestBody Book book) {
		br.save(book);
		System.out.println(book);
		System.out.println("save book method invoked " + book.getTitle() +" "+ book.getId());
		return "Book Saved Successfully";
	}

}
