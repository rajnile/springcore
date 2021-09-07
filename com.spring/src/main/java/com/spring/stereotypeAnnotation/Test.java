package com.spring.stereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/stereotypeAnnotation/stereocfg.xml");
		Student s1 = (Student) context.getBean("student");
		System.out.println(s1);
		System.out.println(s1.getAddr());
		System.out.println(s1.getAddr().getClass().getName());
	}

}
