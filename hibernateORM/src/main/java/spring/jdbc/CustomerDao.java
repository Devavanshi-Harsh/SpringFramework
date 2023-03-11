package spring.jdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class CustomerDao {
		public JdbcTemplate jdbcTemp;
		RowMapper<Customer> rmpl = new RowMapperImplementation();

		public JdbcTemplate getJdbcTemp() {
			return jdbcTemp;
		}

		public void setJdbcTemp(JdbcTemplate jdbcTemp) {
			this.jdbcTemp = jdbcTemp;
		}

		public void insert(Customer customer) {
			String query = "insert into customer values (?,?,?,?)";
			jdbcTemp.update(query, customer.getsNo(),customer.getfName(),customer.getlName(), customer.getAge());
		}
		public Customer getObjectFromRows(int sNo) {
			String query = "select * from customer where SerialNumber = ? ;";
			Customer c = jdbcTemp.queryForObject(query, rmpl, sNo);
			return c;
		}
		public List<Customer> getObjectsFromRows() {
			String query = "select * from customer;";
			List<Customer> c = jdbcTemp.query(query, rmpl);
			return c;
		}
}
