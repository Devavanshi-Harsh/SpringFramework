package com.SpringFramework.LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoaderClass {

	public static void main(String[] args) {
//		we don't have destroy hook in application context class for that we have to come out to parent interface now
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringFramework/LifeCycle/LifeCycle.xml");
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/SpringFramework/LifeCycle/LifeCycle.xml");
		LifeCycleClass obj1 = (LifeCycleClass) context.getBean("obj1");
		System.out.println(obj1);
		//but untill this point of time it will not destroy the file.
		//use this method in the abstract class
		context.registerShutdownHook();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Using interfaces InitializingBean and DisposableBean\n\n\n");
		
		LifeCycleClass obj2 = (LifeCycleClass) context.getBean("obj2");
		System.out.println(obj2);
		//but untill this point of time it will not destroy the file.
		//use this method in the abstract class
		context.registerShutdownHook();
				

	}

}
