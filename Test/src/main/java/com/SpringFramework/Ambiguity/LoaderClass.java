package com.SpringFramework.Ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoaderClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Ambiguity.xml");
		Ambiguity obj1 = (Ambiguity) context.getBean("add1");
		System.out.println(obj1);
		Ambiguity obj2 = (Ambiguity) context.getBean("add2");
		System.out.println(obj2);
		Ambiguity obj3 = (Ambiguity) context.getBean("add3");
		System.out.println(obj3);	
		

	}

}
