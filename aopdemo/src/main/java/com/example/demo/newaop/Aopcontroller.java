package com.example.demo.newaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Aopcontroller {
	
	@Autowired
	Aopservices at;
	
	@PostMapping("/make")
	public String make(@RequestBody Aopmodel am) {
		return(at.make(am));
		
	}
}
