package spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Loader {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/jdbc/jdbc.xml");
		CustomerDao c = context.getBean("customerDAO", CustomerDao.class);
//		Customer customer = new Customer(1,"Harsh", "Devavanshi", 26);
//		c.insert(customer);
		//getting single objects from table
//		Customer customer = c.getObjectFromRows(1);
//		System.out.println(customer);
		List<Customer> customers = c.getObjectsFromRows();
		System.out.println(customers.get(0));
		//getting complete table objects
		System.out.println("Task done...");

	}

}
