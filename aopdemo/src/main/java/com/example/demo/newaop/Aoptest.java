package com.example.demo.newaop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aoptest {

	

	// @Before("execution(public void show())")
	@Before(value = "execution(* com.example.demo.newaop.Aopcontroller.make(..))")
	public void helper() {
		//Aopmodel am;
		System.out.println("Before Aspect activated...");
		//System.out.println("number = "+am.getNumber());
		//System.out.println("name = "+am.getName());
		
	}
	
	
	@After(value = "execution(* com.example.demo.newaop.Aopcontroller.*(..))")
	public void helpe() {
		System.out.println("After Aspect activated...");
	}
}
