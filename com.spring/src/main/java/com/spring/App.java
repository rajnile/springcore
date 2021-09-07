package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new ClassPathXmlApplicationContext("cfg.xml");
//     First bean
      Student student1= (Student) context.getBean("student1");
    
//      Second bean
      Student student2 =(Student) context.getBean("student2");
      System.out.println(student1);
      System.out.println(student2);
    }
}
