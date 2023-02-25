package utilSchemaStandaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoaderClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"utilSchemaStandaloneCollections/StandaloneCollections.xml");
		CollectionClasses c = context.getBean("collections", CollectionClasses.class);
		System.out.println(c);

	}

}
