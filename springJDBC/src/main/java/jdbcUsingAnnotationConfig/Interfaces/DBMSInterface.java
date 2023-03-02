package jdbcUsingAnnotationConfig.Interfaces;
import jdbcUsingAnnotationConfig.Student;
import java.util.List;

public interface DBMSInterface {
	public void insert(Student s);
	public void change(Student s);
	public void delete(int roll_number);
	public Student getObject(int roll_number);
	public List<Student> getObjects();
}
