package com.SpringFramework.LifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationLifyCycle {
	private String name;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "AnnotationLifeCycleClass [name=" + name + ", price=" + price + "]";
	}
	
	//same as init method we can change the name but not the signature
	@PostConstruct
	public void init() throws Exception {
		System.out.println("afterPropertiesSet Method");
		
	}
	//same as destroy method we can change the name but not the signature
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("destroy Method");
		
	}
	
}
