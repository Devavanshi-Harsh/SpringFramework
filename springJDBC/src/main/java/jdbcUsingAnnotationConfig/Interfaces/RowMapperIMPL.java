package jdbcUsingAnnotationConfig.Interfaces;
import jdbcUsingAnnotationConfig.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class RowMapperIMPL implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setRoll_number(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setCourse(rs.getString(3));
		return student;
	}

}
