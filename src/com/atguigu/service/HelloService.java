package com.atguigu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.controller.HelloHandle;

@Service
public class HelloService {
	
	@Autowired
	HelloHandle helloHandle;

}
