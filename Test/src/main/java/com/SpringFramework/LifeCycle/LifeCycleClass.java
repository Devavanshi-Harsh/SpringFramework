package com.SpringFramework.LifeCycle;

public class LifeCycleClass{
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
			return "LifeCycleClass [name=" + name + ", price=" + price + "]";
		}
		public void init() {
			System.out.println("Init method");
		}
		public void destroy() {
			System.out.println("Destroy method");
		}
		
		public void hi() {
			System.out.println("Init as a hi method");
		}
		public void bye() {
			System.out.println("Destroy as a bye method");
		}
		
		
		
}
