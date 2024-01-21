package com.javaex.ex05;

import java.io.Serializable;

public class Person implements Serializable {
	
	//직렬화 대상은 Serializable을 구현해야 합니다.
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void tell() {
		System.out.println("안녕하세요." + age + "살 " + name + "입니다");
	}
	
	
}
