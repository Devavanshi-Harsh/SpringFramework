package scope;

public class Teacher {
	private String name;
	private String subject;
	public Teacher(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + "]";
	}
	
	
}
