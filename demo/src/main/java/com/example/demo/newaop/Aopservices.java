package com.example.demo.newaop;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Aopservices {
	
	@RequestMapping("/make")
	public void make() {
		System.out.println("Something printed");
	}
}
