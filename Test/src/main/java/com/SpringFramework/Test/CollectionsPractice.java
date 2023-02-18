package com.SpringFramework.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsPractice {
	public String name;
	public List<String> phoneNumber;
	public Set<String> addresses;
	public Map<String, Integer> course;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	public Map<String, Integer> getCourse() {
		return course;
	}

	public void setCourse(Map<String, Integer> course) {
		this.course = course;
	}
}
