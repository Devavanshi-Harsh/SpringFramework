package com.SpringFramework.Autowiring.files;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAutowireLoaderClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/SpringFramework/Autowiring/AnnotationAutowiring.xml");
		AnnotationAutowiring d = context.getBean("autowire", AnnotationAutowiring.class);
		System.out.println(d);

	}

}
