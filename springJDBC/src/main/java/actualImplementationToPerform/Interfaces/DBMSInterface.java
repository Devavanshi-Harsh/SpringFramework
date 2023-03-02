package actualImplementationToPerform.Interfaces;

import java.util.List;

import actualImplementationToPerform.Student;

public interface DBMSInterface {
	public void insert(Student s);
	public void change(Student s);
	public void delete(int roll_number);
	public Student getObject(int roll_number);
	public List<Student> getObjects();
}
