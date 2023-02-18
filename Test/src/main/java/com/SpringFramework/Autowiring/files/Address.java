package com.SpringFramework.Autowiring.files;

public class Address {
	public String city;
	public String district;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
		System.out.println("city setted");
			
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
		System.out.println("District setted");
		
	}
	
	
	}
	

