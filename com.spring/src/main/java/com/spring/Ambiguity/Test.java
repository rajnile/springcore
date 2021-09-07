package com.spring.Ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/Ambiguity/amb.xml");
		Addition addition= (Addition) context.getBean("add");
		System.out.println(addition);
	}

}
