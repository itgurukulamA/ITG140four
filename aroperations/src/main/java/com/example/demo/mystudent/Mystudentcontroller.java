package com.example.demo.mystudent;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mystudentcontroller {
	@Autowired
	Mystudentservices msy;
	
	@PostMapping("/data")
	public String insert(@RequestBody Mystudent mast) {
		
		int i = msy.insert(mast);
		if(i>0) {
			return("inserted sucessfully");
		}
		else {
			return("not inserted");
		}
	}
}
