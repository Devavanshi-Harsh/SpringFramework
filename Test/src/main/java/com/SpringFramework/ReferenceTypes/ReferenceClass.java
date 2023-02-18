package com.SpringFramework.ReferenceTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceClass {

	public static void main(String[] args) {
		ApplicationContext cont = new ClassPathXmlApplicationContext("ReferenceConfig.xml");
		A _a = (A)cont.getBean("aref");
		System.out.println(_a.z.getY());

	}

}
