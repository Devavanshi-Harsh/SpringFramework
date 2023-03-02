package jdbcUsingAnnotationConfig.Interfaces;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import jdbcUsingAnnotationConfig.Student;

@Component("Op")
public class Operations implements DBMSInterface {
	@Autowired
	private JdbcTemplate t;
	
	public JdbcTemplate getT() {
		return t;
	}
	
	public void setT(JdbcTemplate t) {
		this.t = t;
	}

	public void insert(Student s) {
		String query = "insert into students(roll_number, Name, class) values(?,?,?)";
		this.t.update(query, s.getRoll_number(), s.getName(), s.getCourse());

	}

	public void change(Student s) {
		String query = "update Students set Name=?, Class=? where roll_number =?";
		this.t.update(query, s.getName(), s.getCourse(), s.getRoll_number());
	}

	public void delete(int roll_number) {
		String query = "Delete from students where roll_number =?";
		this.t.update(query, roll_number); 
	}
	public Student getObject(int roll_number) {
		String query = "select * from students where roll_number=?";
		RowMapper<Student> rm = new RowMapperIMPL();
		Student s =this.t.queryForObject(query, rm, roll_number);
		return s;
	}

	@Override
	public List<Student> getObjects() {
		String query = "select * from students;";
		RowMapper<Student> rm = new RowMapperIMPL();
		List<Student> s = this.t.query(query, rm);
		return s;
	}

}
