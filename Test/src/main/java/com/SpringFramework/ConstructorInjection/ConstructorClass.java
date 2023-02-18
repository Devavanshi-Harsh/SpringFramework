package com.SpringFramework.ConstructorInjection;

import java.util.List;

class ConstructorClass {
	String name;
	int salary;
	String location;
	List<String> friends;
	ConstructorClass(String name, int salary, String location) {
		this.name = name;
		this.salary = salary;
		this.location = location;
	}
	ConstructorClass(String name, int salary, String location, List<String> friends) {
		this.name = name;
		this.salary = salary;
		this.location = location;
		this.friends = friends;
	}
	@Override
    public String toString() {

		StringBuilder sb = new StringBuilder("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", salary='").append(salary).append('\'');
        sb.append(", location='").append(location).append('\'');
        sb.append('}');
        return sb.toString();
    }
	
}
