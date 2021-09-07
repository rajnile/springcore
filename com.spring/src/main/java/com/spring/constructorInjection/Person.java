package com.spring.constructorInjection;

public class Person {

	private String name;
	private int persId;
	Certi certi;

	public Person(String name, int persId, Certi certi) {
		this.name = name;
		this.persId = persId;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", persId=" + persId + ", certi=" + certi + "]";
	}

}
