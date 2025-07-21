package com.jsp.bms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
	
	@RequestMapping("/savebook")
	public String saveBook() {
		System.out.println("save book method invoked");
		return "Book Saved Successfully";
	}

}
