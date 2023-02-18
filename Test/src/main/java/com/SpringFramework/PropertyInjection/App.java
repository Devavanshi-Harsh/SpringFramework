package com.SpringFramework.PropertyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("PropertyInjection.xml");
		Student s = (Student)context.getBean("random");
		System.out.println(s.b);
		Student e = (Student)context.getBean("random2");
		System.out.println(e.b);
		Student m = (Student)context.getBean("random3");
		System.out.println(((Object)m.a).getClass().getSimpleName());
		CollectionsPractice p = (CollectionsPractice) context.getBean("Student1");
		System.out.println(p.addresses);
	}
}

 