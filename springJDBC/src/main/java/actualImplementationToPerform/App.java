package actualImplementationToPerform;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import actualImplementationToPerform.Interfaces.Operations;
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("actualImplementationToPerform/jdbc.xml");
        Operations operations = context.getBean("Op", Operations.class);
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows do you want to insert? : ");
        int n = sc.nextInt();
        for(int i =0; i< n ;i++) {
        	
        	System.out.print("\tEnter roll number : ");
            int roll_Number=sc.nextInt();
            sc.nextLine();
            System.out.print("\tEnter Name : ");
            String name = sc.nextLine();
            System.out.print("\tEnter Course : ");
            String course = sc.nextLine();
            Student obj = new Student(roll_Number,name,course);
            operations.insert(obj);
        }
        //for single row
        Student s =operations.getObject(6302);
        System.out.println(s);
        //for multiple row
        List<Student> students = operations.getObjects();
        for(Student person: students) {
        	System.out.println(person);
        }
        System.out.println("Task done...");
    }
}
