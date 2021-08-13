package com.example.demo.ardemo;

public class Arithimaticservices {

	
	public int add(Arithimatic ar) {
		return ar.getNumber1()+ar.getNumber2();
	}
	
	public int sub(Arithimatic ar) {
		return ar.getNumber1()-ar.getNumber2();
	}
	
	public int div(Arithimatic ar) {
		return ar.getNumber1()/ar.getNumber2();
	}
	
	public int mul(Arithimatic ar) {
		return ar.getNumber1()*ar.getNumber2();
	}
}
