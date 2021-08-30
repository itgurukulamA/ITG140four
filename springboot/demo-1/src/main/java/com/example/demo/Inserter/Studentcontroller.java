package com.example.demo.Inserter;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Studentcontroller {
	
	@Autowired	
	Studentservice ss;
	
	@RequestMapping("/data")
	public String insert(@RequestBody Student st) {
		String i = ss.insert(st);
		return(i);
	}
	
	@RequestMapping("/dataupdate")
	public String myupdate(@RequestBody Student st) {
		String i = ss.insert(st);
		return(i);
	}
	@RequestMapping("/dataparam")
	public Map<String, String> insertparam(@RequestBody Student st) { 
		Map<String, String> i =ss.insertItems(st);
		return(i);
	}
	
	@RequestMapping("/idchecker")
	public String count(@RequestBody Student st) {
		int i = ss.counter(st);
		if(i>0) {
			return "already exists";
		}
		else {
			return "not exixts in database";
		}
	}
}
