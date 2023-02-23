package com.SpringFramework.Autowiring.files;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoaderClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringFramework/Autowiring/Autowiring.xml");
		AutowiringClass c = context.getBean("person", AutowiringClass.class);
		System.out.println(c);
		

	}

}
