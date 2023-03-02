package spring.springJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/springJDBC/jdbc.xml");
        JdbcTemplate template = context.getBean("jdbcTemp", JdbcTemplate.class);
        String query = "insert into students(roll_number, Name, class) values(?,?,?)";
        template.update(query,6002,"Diksha Jasrasaria", "Physics");
    }
}
