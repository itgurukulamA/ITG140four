package com.example.demo.Inserter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

//import com.example.demo.mystudent.Mystudent;

@Service
public class Studentservice {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	public int insert(Student st) {
		int id = st.getId();
		int age = st.getAge();
		String name = st.getName();
		String email = st.getEmail();
		int phone = st.getPhonenumber();
		int i = jdbcTemplate.update("INSERT INTO ITG140 VALUES (?,?,?,?,?)", id,name,age,email,phone);
		//(id,name,age,email,phonenumber)
		return i;
	}
}
