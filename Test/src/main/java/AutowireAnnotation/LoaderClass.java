package AutowireAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoaderClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AutowireAnnotationQualifier.xml");
		Emp a = context.getBean("Emp", Emp.class);
		System.out.println(a);

	}

}
