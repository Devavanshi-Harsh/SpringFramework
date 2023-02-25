package stereotypeAnnotations.files;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoaderClass {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("stereotypeAnnotations/stereotypeAnnotations.xml");
		Student s = con.getBean("obj1", Student.class);
		System.out.println(s);
	}

}
