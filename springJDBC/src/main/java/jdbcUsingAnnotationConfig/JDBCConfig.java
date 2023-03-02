package jdbcUsingAnnotationConfig;

import javax.sql.DataSource;
import jdbcUsingAnnotationConfig.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import jdbcUsingAnnotationConfig.Interfaces.Operations;

@Configuration
@ComponentScan(basePackages = "jdbcUsingAnnotationConfig.Interfaces")
public class JDBCConfig {
	@Bean(name = {"ds"})
	public DataSource getDataSource() {
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/springpractice";
		String Username ="root";
		String password = "Exams@1st";
		DriverManagerDataSource ds = new DriverManagerDataSource(url, Username,password);
		ds.setDriverClassName(driverName);
		return ds;
	}
	@Bean(name = {"jdbcTemp"})
	public JdbcTemplate getTemplate() {
		
		JdbcTemplate jdbcTemp = new JdbcTemplate();
		jdbcTemp.setDataSource(getDataSource());
		return jdbcTemp;
	}
//	@Bean(name = {"Op"})
//	public Operations getOperation() {
//		Operations op = new Operations();
//		op.setT(getTemplate());
//		return op;
//	}
}
