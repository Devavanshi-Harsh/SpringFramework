package com.SpringFramework.LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnotherLoaderClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/SpringFramework/LifeCycle/AnothorLifeCycle.xml");

		System.out.println("Using interfaces InitializingBean and DisposableBean\n\n\n");
		
		AnotherLifeCycleClass obj2 = (AnotherLifeCycleClass) context.getBean("obj2");
		System.out.println(obj2);
		//but untill this point of time it will not destroy the file.
		//use this method in the abstract class
		context.registerShutdownHook();

	}

}
