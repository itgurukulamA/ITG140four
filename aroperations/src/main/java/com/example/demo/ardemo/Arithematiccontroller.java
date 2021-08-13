package com.example.demo.ardemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Arithematiccontroller {

	@GetMapping("/addition")
	public int add(int a, int b) {
		return a+b;
	}
	@GetMapping("/substraction")
	public int sub(int a, int b) {
		return a-b;
	}
	@GetMapping("/division")
	public int div(int a, int b) {
		return a/b;
	}
	@GetMapping("/multiplication")
	public int mul(int a, int b) {
		return a*b;
	}


}
