package com.example.demo.newaop;

import java.lang.reflect.Field;

import org.aspectj.weaver.ast.FieldGet;
import org.springframework.stereotype.Service;

@Service
public class Aopservices {
	
	public String make(Aopmodel am) {
		int number = am.getNumber();
		String name = am.getName();
		String result =number+"----"+name;
		//System.out.println();
		
		try {
	       
	         Class<?> c = am.getClass();
	         Field[] fields = c.getDeclaredFields();
	         for(int i = 0; i < fields.length; i++) {
	           //System.out.println("The field is: " + fields[i].toString());
	           String r = fields[i].toString();
	           System.out.println(r.substring(r.lastIndexOf(".")+1,r.length())+" : "+fields[i].getType());
	           //System.out.println(fields[i].toString());
	         }
	      } catch(Exception e) {
	         System.out.println(e.toString());
	      }
		return result;
	}

	
}
