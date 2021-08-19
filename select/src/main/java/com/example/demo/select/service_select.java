package com.example.demo.select;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

@Service
public class service_select {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public Map<String, String>Items(select select)
	{	
		Map<String, String> data = new HashMap<String, String>();
		int result = 0;
		String sql = "INSERT INTO items (id,name,age,email) VALUES (id,Name,age,email)";
		try
		{
			SqlParameterSource parameters = new MapSqlParameterSource()
					.addValue("id", select.getId())
					.addValue("Name", select.getName())
					.addValue("age",select.getAge())
					.addValue("email",select.getEmail());

			result = namedParameterJdbcTemplate.update(sql, parameters);
			if (result > 0)
				data.put("success", "Record inserted successfully");
			else
				data.put("failed", "Record failed to insert, please try again!");
		} catch (Exception e) {
			data.put("error", "Error occured, please try again!");
			
		}
		
		return data;

	}
	public Map<String, String> update(select select, Object name) {
		
		Map<String, String> data = new HashMap<String, String>();
		int result = 0;
		String sql = "update Items set age=?where name=?";
		String email=select.getEmail();
		try {
			result = jdbcTemplate.update(sql,name,select.getName());
			if (result > 0)
				data.put("success", "updated successfully");
			else
				data.put("failed", "updation failed");
		} catch (Exception e) {
			data.put("error", "Error occured, please try again!");
	e.printStackTrace();
		}
		
		return data;
	}

	public List getAll() {
		
		Map dataMap = null;
		List responseList = new ArrayList();
		List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
		String sql = "select id,name,description,price from items";

		try {
			dataList = jdbcTemplate.queryForList(sql);

			for (Map<String, Object> row : dataList) {
				dataMap = new HashMap();
				dataMap.put("id", row.get("id"));
				dataMap.put("name", row.get("name"));
				dataMap.put("age", row.get("age"));
				dataMap.put("email", row.get("email"));
				responseList.add(dataMap);
			}

		} catch (Exception e) {
			dataMap.put("error", "Error occured");

		}
		
		return responseList;
	}
public List get(int id) {
		
		Map dataMap = new HashMap();
		List responseList = new ArrayList();
		List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
		String sql = "select id,name,age,email from items where id = ?";
		try {
			dataList = jdbcTemplate.queryForList(sql, id);

			for (Map<String, Object> row : dataList) {
				dataMap.put("id", row.get("id"));
				dataMap.put("name", row.get("name"));
				dataMap.put("age", row.get("age"));
				dataMap.put("email", row.get("email"));
				responseList.add(dataMap);
			}

		} catch (Exception e) {
			dataMap.put("error", "Error occured");
		}
		
		return responseList;
	}

}