package com.example.demo.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class crudService {
	
	  @Autowired
      JdbcTemplate jdbcTemplate;
      
    public String insert(crud cd) {
    	  String s = "insert into employee(id,name,desigination,salary)values(?,?,?,?)";
    	  int s1 = jdbcTemplate.update(s,cd.getId(),cd.getName(),cd.getDesigination(),cd.getSalary());
    	  if(s1>0) {
    		  return "data inserted successfully";
    	  }else {
    		  return "data not inserted";
    	  }
      }
      public String update(crud cd) {
    	  String s2 = "UPDATE employee SET name=? WHERE id=?";
    	  int s3 = jdbcTemplate.update(s2,cd.getName(),cd.getId());
    	  if(s3>0) {
    		  return "updated successfully";
    	  }else {
    		  return "not updated";
    	  }
      }
      public String delete(crud cd) {
    	  String sql = "DELETE FROM employee WHERE id=?";
    	  int sql1 = jdbcTemplate.update(sql,cd.getId());
    	  if(sql1>0) {
    		  return "deleted successfully";
    	  }else {
    		  return "not deleted";
    	  }
      }
       
}
