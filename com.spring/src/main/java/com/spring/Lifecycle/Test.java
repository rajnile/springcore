package com.spring.Lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springLifecycle/samcfg.xml");
		Samosa s = (Samosa) context.getBean("sam");
		System.out.println(s);
	}

}
