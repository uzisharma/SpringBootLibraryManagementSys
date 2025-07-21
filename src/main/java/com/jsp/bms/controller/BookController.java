package com.jsp.bms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {
	
	
	@RequestMapping("/savebook")
	public String saveBook(@RequestParam String title, @RequestParam int id) {
		System.out.println("save book method invoked " + title +" "+ id);
		return "Book Saved Successfully";
	}

}
