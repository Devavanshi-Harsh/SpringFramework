package complexFormHandling.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "Addresses")
public class Address {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int id;
//	public int getId() {
//		return id;
//	}
//	@Column(name = "StreetName")
	private String StreetName;
//	@Column(name = "AddressLineOne")
	private String AddressLineOne;
//	@Column(name = "AddressLineTwo")
	private String AddressLineTwo;
//	@Column(name = "AreaCode")
	private String AreaCode;
//	@Column(name = "State")
	private String State;
//	@Column(name = "Country")
	private String Country;
	public String getStreetName() {
		return StreetName;
	}
	public void setStreetName(String streetName) {
		StreetName = streetName;
	}
	public String getAddressLineOne() {
		return AddressLineOne;
	}
	public void setAddressLineOne(String addressLineOne) {
		AddressLineOne = addressLineOne;
	}
	public String getAddressLineTwo() {
		return AddressLineTwo;
	}
	public void setAddressLineTwo(String addressLineTwo) {
		AddressLineTwo = addressLineTwo;
	}
	public String getAreaCode() {
		return AreaCode;
	}
	public void setAreaCode(String areaCode) {
		AreaCode = areaCode;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	@Override
	public String toString() {
		return "Address [StreetName=" + StreetName + ", AddressLineOne=" + AddressLineOne + ", AddressLineTwo="
				+ AddressLineTwo + ", AreaCode=" + AreaCode + ", State=" + State + ", Country=" + Country + "]";
	}

}
