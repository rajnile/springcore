package com.spring.Standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/Standalone/standcfg.xml");
//		Person p= (Person) context.getBean("per");
//		System.out.println(p);
		Person p1 =(Person) context.getBean("per");
		System.out.println(p1);
		System.out.println(p1.getAddr().getClass().getName());
		System.out.println("--------------------------");
		System.out.println(p1.getCources());
		System.out.println(p1.getCources().getClass().getName());
		System.out.println("_________________________________________");
		System.out.println(p1.getProperties());
		System.out.println(p1.getProperties().getClass().getName());
	}

}
