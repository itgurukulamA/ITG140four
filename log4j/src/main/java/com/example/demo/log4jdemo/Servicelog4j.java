package com.example.demo.log4jdemo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class Servicelog4j {
	@Autowired
	JdbcTemplate jt;
	public static Logger log = Logger.getLogger(Servicelog4j.class);

	public String insert(Pozolog4j p4j)

	{
		log.info("hello i am logger method");
		String k = "insert into log4j values(?,?,?,?)";
		int id = p4j.getId();
		String name = p4j.getName();
		String email = p4j.getEmail();
		int age = p4j.getAge();
		int result = jt.update(k, id, name, age, email);
		if (result > 0) {
			return "data is fetched";
		} else {
			return "data is not fetched";
		}
	}

	public String delete(Pozolog4j p4j) {
		String k = "delete from log4j where id=?";
		int id = p4j.getId();
		int result = jt.update(k, id);
		if (result > 0) {
			return "data is deleted succefully";
		} else {
			return "data is not deleted";
		}
	}

	public String update(Pozolog4j p4j) {
		String k = "update log4j set name=? where id=?";
		int id = p4j.getId();
		String name = p4j.getName();
		int result = jt.update(k, name, id);
		if (result > 0) {
			return "data is updated succefully";
		} else {
			return "data is not updated";
		}
	}

	public List<Pozolog4j> get(int pageno, int size) {
		String k = "select * from log4j limit ";
		int i =(pageno-1)*size;
		k=k+i+","+size;
		List<Pozolog4j> p = jt.query(k,
				(rs, rownum) -> new Pozolog4j(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
		return p;
	}
}
