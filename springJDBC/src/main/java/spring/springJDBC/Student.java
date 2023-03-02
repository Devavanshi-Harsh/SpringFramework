package spring.springJDBC;

public class Student {
	private int roll_number;
	private String name;
	private String course;
	public int getRoll_number() {
		return roll_number;
	}
	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [roll_number=" + roll_number + ", name=" + name + ", course=" + course + "]";
	}
	
}
