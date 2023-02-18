package com.SpringFramework.LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationLoaderClass {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/SpringFramework/LifeCycle/AnnotationLifeCycle.xml");

		System.out.println("Using An notation InitializingBean and DisposableBean\n\n\n");
		
		AnnotationLifyCycle obj = (AnnotationLifyCycle) context.getBean("obj");
		System.out.println(obj);
		//but untill this point of time it will not destroy the file.
		//use this method in the abstract class
		context.registerShutdownHook();

	}

}
