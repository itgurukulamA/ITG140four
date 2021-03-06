package com.example.demo.Inserter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Studentcontroller {
	
	@Autowired	
	Studentservice ss;
	
	@PostMapping("/data")
	public String insert(@RequestBody Student st) {
		int i = ss.insert(st);
		if(i>0) {
			return("inserted sucessfully");
		}
		else {
			return("not inserted");
		}
	}

}
