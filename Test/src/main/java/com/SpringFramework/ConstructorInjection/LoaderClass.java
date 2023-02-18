package com.SpringFramework.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoaderClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configure.xml");
		ConstructorClass obj1 = (ConstructorClass) context.getBean("Emp1");
		System.out.println(obj1.name+" "+obj1.salary+" "+ obj1.location+" "+obj1.friends);
		ConstructorClass obj2 = (ConstructorClass) context.getBean("Emp2");
		System.out.println(obj2);
//		ConstructorClass obj3 = (ConstructorClass) context.getBean("Emp3");
//		System.out.println(obj3);
//		<bean id="Emp3" class="com.SpringFramework.ConstructorInjection.ConstructorClass" p:name="Kajal Devavanshi" p:salary="905000" p:location="Azamgarh" />

		  

	}

}
