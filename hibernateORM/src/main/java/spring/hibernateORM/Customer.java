package spring.hibernateORM;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_info")
public class Customer {
	@Id
	@Column(name = "Serial_Number")
	private int sNo;
	@Column(name = "First_Name")
	private String fName;
	@Column(name = "Last_Name")
	private String lName;
	@Column(name = "Age")
	private int age;
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Customer() {
	}
	public Customer(int sNo, String fName, String lName, int age) {
		this.sNo = sNo;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}
	@Override
	public String toString() {
		return "sNo=" + sNo + ", fName=" + fName + ", lName=" + lName + ", age=" + age ;
	}
	
}
