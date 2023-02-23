package com.SpringFramework.Autowiring.files;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AnnotationAutowiring {

	// this annotation place will vary according to its position.
	// will work as byName;

	@Autowired
	@Qualifier("address1")
	public Address address;

	public Address getAddress() {
		return address;
	}

	// will work as byType
//	@Autowired
	public void setAddress( Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "AnnotationAutowiring [address=" + address.city + " " + address.district + "]";
	}

	// will work as contructor
	// @Autowired
	public AnnotationAutowiring(Address address) {
		super();
		this.address = address;
	}

}
