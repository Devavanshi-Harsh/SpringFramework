package spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImplementation implements RowMapper<Customer>{

	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer c = new Customer();
		c.setsNo(rs.getInt(1));
		c.setfName(rs.getString(2));
		c.setlName(rs.getString(3));
		c.setAge(rs.getInt(4));
		
		return c;
	}

}
