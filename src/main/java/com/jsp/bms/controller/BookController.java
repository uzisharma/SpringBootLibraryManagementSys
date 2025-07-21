package com.jsp.bms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsp.bms.entity.Book;

@Controller
public class BookController {
	
	@ResponseBody
	@RequestMapping("/savebook")
	public String saveBook(@RequestBody Book book) {
		System.out.println(book);
		System.out.println("save book method invoked " + book.getTitle() +" "+ book.getId());
		return "Book Saved Successfully";
	}

}
