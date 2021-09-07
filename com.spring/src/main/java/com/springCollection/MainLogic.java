package com.springCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCollection/confi.xml");
		Emp emp1= (Emp) context.getBean("emp1");
		
		System.out.println(emp1.getName());
		System.out.println(emp1.getNumbers());
		System.out.println(emp1.getAddr());
		System.out.println(emp1.getCourses());

	}

}
