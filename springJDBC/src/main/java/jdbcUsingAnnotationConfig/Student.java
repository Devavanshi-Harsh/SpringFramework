package jdbcUsingAnnotationConfig;

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
	public Student(){
		
	}
	public Student(int roll_number, String name, String course) {
		this.roll_number = roll_number;
		this.name = name;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [\t\t roll_number = "+roll_number + "\t name = "+name + "\t\t course = "+course + "\t\t ]";
	}
	
}
