package com.example.demo.newaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Aoptest {
	// @Before("execution(public void show())")
	@Before(value = "execution(* com.example.demo.newaop.Aopservices.make())")
	public void helper() {
		System.out.println("Before Aspect activated...");
	}
	
	@After(value = "execution(* com.example.demo.newaop.Aopservices.make())")
	public void helpe() {
		System.out.println("After Aspect activated...");
	}
}
