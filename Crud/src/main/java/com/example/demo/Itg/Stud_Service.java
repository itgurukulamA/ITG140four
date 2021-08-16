package com.example.demo.Itg;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

@Service
public class Stud_Service {

		@Autowired JdbcTemplate jt;
	public int insert(Stud s)
	{
	int id=s.getId();
	int age=s.getAge();
	String name=s.getName();
	String email=s.getEmail();
	String sql="insert into student values(?,?,?,?)";
	return jt.update(sql,id,name,email,age);
	}
	
	
	@Autowired JdbcTemplate j;
	@Autowired NamedParameterJdbcTemplate k;
	public Map<String, String> update(Stud s)
	{
	Map<String, String> data = new HashMap();
	int result=0;
	String sql="update student set name=:name where id=:id";
	SqlParameterSource parameters =new MapSqlParameterSource()
			.addValue("id",s.getId())
			.addValue("name",s.getName())
			.addValue("email",s.getEmail())
			.addValue("age",s.getAge());
	result = k.update(sql,parameters);
	if(result>0)
	{
		data.put("sucess","data inserted");
	}else
	{
		data.put("failed","data not inserted");
	}
	return data;
	}
	
	
	
	
	@Autowired JdbcTemplate t;
	@Autowired NamedParameterJdbcTemplate c;
	public Map<String, String> select(Stud s)
	{
	Map<String, String> data = new HashMap();
	int result=0;
	String sql="select* from student";
	SqlParameterSource parameters =new MapSqlParameterSource();
			int id=s.getId();
	int age=s.getAge();
	String name=s.getName();
	String email=s.getEmail();
	return t.select(sql,id,name,email,age);
	if(result>0)
	{
		data.get("sucess");
	}else
	{
		data.get("failed");
	}
	return data;
	}
	
	
	}
