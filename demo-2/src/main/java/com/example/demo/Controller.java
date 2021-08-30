package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@PostMapping("/add")
	public Student ad(@RequestBody Student s) {
		return s;
	}
}
