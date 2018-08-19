package com.atguigu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atguigu.service.BookService;

@Controller
public class BookHandler {
	
	@Autowired
	private BookService bookService;
	
	public BookHandler(){
		System.out.println("BookHandler...");
	}
	
	@RequestMapping("/handle01")
	public String handle01(){
		bookService.hello();
		
		//  /WEB-INF/pages/success.jsp
		//  /success.jsp
		return "../../success";
	}

}
