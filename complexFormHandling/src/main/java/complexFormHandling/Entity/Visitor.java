package complexFormHandling.Entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "Visitors")
public class Visitor {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
//	@Column(name = "First_Name")
	private String FirstName;
//	@Column(name = "Last_Name")
	private String LastName;
//	@Column(name = "Email")
	private String Email;
//	@Column(name = "Date_Of_Birth")
	private Date dob;
//	@Column(name = "Course")
	private String Course;
//	@Column(name = "Gender")
	private String Gender;
//	@Column(name = "Address")
	private Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Visitor [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email
				+ ", dob=" + dob + ", Course=" + Course + ", Gender=" + Gender + ", address=" + address + "]";
	}
	
	

}
