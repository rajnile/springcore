package com.spring.ExpressionLang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/ExpressionLang/recfg.xml");
		Demo d=  context.getBean("demo",Demo.class);
		System.out.println(d);
	}

}
