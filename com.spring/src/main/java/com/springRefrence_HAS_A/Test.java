package com.springRefrence_HAS_A;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springRefrence_HAS_A/conf.xml");
		A temp = (A) context.getBean("aref");
		System.out.println(temp.getX());
		System.out.println(temp.getB().getY());

	}

}
