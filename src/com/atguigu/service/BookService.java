package com.atguigu.service;

import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	public BookService(){
		System.out.println("BookService...");
	}
	
	public void hello(){
		System.out.println("哈哈，我被调用了...");
	}

}
