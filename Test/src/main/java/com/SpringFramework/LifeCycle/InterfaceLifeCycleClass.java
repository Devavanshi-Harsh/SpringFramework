package com.SpringFramework.LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

class InterfaceLifeCycleClass  implements InitializingBean, DisposableBean{
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
		return "InterfaceLifeCycleClass [name=" + name + ", price=" + price + "]";
	}
	
	//same as init method we can change the name but not the signature
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet Method");
		
	}
	//same as destroy method we can change the name but not the signature
	public void destroy() throws Exception {
		System.out.println("destroy Method");
		
	}
	
}
