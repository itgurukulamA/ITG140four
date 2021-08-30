package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Studentcontroller {

	@Autowired
	Studentservice ss;

	@GetMapping("/getdata")
	public String getdata() {
		return ss.getdata();
	}
	
	@PostMapping("/seted")
	public Studentmodel setdata(@RequestBody Studentmodel sm) {
		return ss.seted(sm);
	}
}
