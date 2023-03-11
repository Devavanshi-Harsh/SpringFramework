package spring.hibernateORM;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Loader {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/hibernateORM/ORM.xml");
		CustomerDao c = context.getBean("customerDAO", CustomerDao.class);
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		while(go) {
			System.out.println("Enter \n0 to insert\n1 to get desired row\n2 to get all rows\n3 to delete specific row\n4 to update table row\n5 to exit the program");
			int opt = Integer.parseInt(br.readLine());
			switch(opt) {
			case 0:
				System.out.println("How many rows do you want to add? : ");
				int a = Integer.parseInt(br.readLine());
				for(int i = 0 ; i< a; i++) {
					System.out.print("Serial No : ");
					int sNo =Integer.parseInt(br.readLine());
					System.out.print("First Name : ");
					String fName = br.readLine(); 
					System.out.print("Last Name : ");
					String lName = br.readLine(); 
					System.out.print("Age : ");
					int age =Integer.parseInt(br.readLine());
					Customer customer = new Customer(sNo, fName, lName, age);
					c.insert(customer);
				}
				System.out.println("****************************************************");
				System.out.println("Rows added...");
				System.out.println("****************************************************");
				break;
			case 1:
				System.out.println("Enter Serial_Number of the customer you want to get data of : ");
				int b = Integer.parseInt(br.readLine());
				System.out.println("****************************************************");
				System.out.println(c.getObject(b));
				System.out.println("****************************************************");
				break;
			case 2:
				System.out.println("****************************************************");
				List<Customer> customers = c.getObjects();
				for(Customer i: customers) {
					System.out.println(i);
				}
				System.out.println("****************************************************");
				break;
			case 3:
				System.out.println("****************************************************");
				System.out.print("Serial No : ");
				int sNo =Integer.parseInt(br.readLine());
				c.delete(sNo);
				System.out.println("****************************************************");
				break;
			case 4:
				break;
			case 5:
				go = false;
				System.out.println("Please rate our service in between 1 to 10 for out quality improvement...");
				break;
			}			
		}
	}
}
