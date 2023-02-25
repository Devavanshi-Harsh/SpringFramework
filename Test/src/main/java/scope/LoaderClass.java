package scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoaderClass {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("scope/scope.xml");
		//singleton scope
		Student s1 = con.getBean("obj1", Student.class);
		System.out.println(s1.hashCode());
		Student s2 = con.getBean("obj1", Student.class);
		System.out.println(s2.hashCode());
		System.out.println("*********************");
		//prototype scope
		Teacher t1 = con.getBean("person", Teacher.class);
		System.out.println(t1.hashCode());
		Teacher t2 = con.getBean("person", Teacher.class);
		System.out.println(t2.hashCode());
	}

}
