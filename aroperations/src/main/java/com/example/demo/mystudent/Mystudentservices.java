package com.example.demo.mystudent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


@Service
public class Mystudentservices {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int insert(Mystudent ms) {
		int id = ms.getId();
		int age = ms.getAge();
		String name = ms.getName();
		String email = ms.getEmail();
		int phone = ms.getPhonenumber();
		int i = jdbcTemplate.update("INSERT INTO ITG140(id,name,age,email,phonenumber) VALUES (?,?,?,?,?)", id,name,age,email,phone);
		return i;
	}
}
