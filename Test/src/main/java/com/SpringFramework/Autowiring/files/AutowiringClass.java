package com.SpringFramework.Autowiring.files;

public class AutowiringClass {
	public Address address;

	public Address getAddress() {
		return address;
	}

	// without setter method getting null object
	public void setAddress(Address address) {
		this.address = address;
	}

	// with contructor autowire don't need this default contructor.
	public AutowiringClass() {
		// TODO Auto-generated constructor stub
	}

	// without default contructor throwing error with byName, byType autowire
	public AutowiringClass(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "AutowiringClass [ " + address.city + " " + address.district + "]";
	}

}
