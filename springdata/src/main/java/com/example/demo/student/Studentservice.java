package com.example.demo.student;

import org.springframework.stereotype.Service;

@Service
public class Studentservice {

	public String getdata() {
		return "hello Peter";
	}
	
	public Studentmodel seted(Studentmodel sm) {
		return sm;
	}

}
