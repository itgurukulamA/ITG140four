package com.example.demo.Inserter;

import java.util.HashMap;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

@Service
public class Studentservice {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public Map<String, String> insertItems(Student item) {

		Map<String, String> data = new HashMap<String, String>();
		String sql = "INSERT INTO itg140 (name,id,age) VALUES (:name,:age,:id)";
		try {
			SqlParameterSource parameters = new MapSqlParameterSource().addValue("name", item.getName())
					.addValue("id", item.getId()).addValue("age", item.getAge());

			int result = namedParameterJdbcTemplate.update(sql, parameters);
			if (result > 0) {
				data.put("success", "Record inserted successfully");
			} 
			else {
				data.put("failed", "Record failed to insert, please try again!");
			}
		} catch (Exception e) {
			data.put("error", "Error occured, please try again!");

		}

		return data;

	}

	public String insert(Student sts) {
		String sql = "insert into itg140 values(?,?,?,?,?) ";
		int id = sts.getId();
		int age = sts.getAge();
		String name = sts.getName();
		String email = sts.getEmail();
		int phone = sts.getPhonenumber();
		// List<Map<String, Object>> search = jdbcTemplate.queryForList("select count(*)
		// from itg140 where id = ?",id);
		// System.out.println(search);
		try {
			int i = jdbcTemplate.update(sql, id, name, age, email, phone);
			if (i > 0) {
				return ("Inserted Sucess");
			}
		} catch (DataIntegrityViolationException e) {
			return ("Duplicate data exixts");
		}
		return "null";
	}
	
	public String myupdate(Student sts) {
		String sql = "update itg140 set name =? where age = ? ";
		int id = sts.getId();
		int age = sts.getAge();
		String name = sts.getName();
		String email = sts.getEmail();
		int phone = sts.getPhonenumber();
		// List<Map<String, Object>> search = jdbcTemplate.queryForList("select count(*)
		// from itg140 where id = ?",id);
		// System.out.println(search);
		try {
			int i = jdbcTemplate.update(sql, name, age);
			if (i > 0) {
				return ("Updated Sucess");
			}
		} catch (DataIntegrityViolationException e) {
			return ("Duplicate data exixts");
		}
		return "null";
	}

	public int counter(Student sts) {
		String sql = "select count(*) from itg140 where id = ?";
		@SuppressWarnings("deprecation")
		int i = jdbcTemplate.queryForObject(sql, new Object[] { sts.getId() }, Integer.class);
		return i;
	}
}
