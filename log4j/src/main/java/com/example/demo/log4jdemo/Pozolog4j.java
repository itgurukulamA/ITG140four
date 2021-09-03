package com.example.demo.log4jdemo;

public class Pozolog4j
{
		
    private int id;
    private String name;
    private int age;
    private String Email;
    
	public int getId() {
		return id;
	}
	public Pozolog4j() {
		super();
	}
	public Pozolog4j(int id, String name, int age, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		Email = email;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
    
}
