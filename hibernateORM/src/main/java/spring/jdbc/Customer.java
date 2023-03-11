package spring.jdbc;

public class Customer {
	private int sNo;
	private String fName;
	private String lName;
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
		return "Customer [sNo=" + sNo + ", fName=" + fName + ", lName=" + lName + ", age=" + age + "]";
	}
	
}
