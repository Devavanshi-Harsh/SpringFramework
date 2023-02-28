package springExpressionLanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class LoaderClass {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("springExpressionLanguage/spel.xml");
		Student s = con.getBean("obj1", Student.class);
		System.out.println(s);
		ExpressionParser parse = new SpelExpressionParser();
		Expression xp = parse.parseExpression("2>2? true: false");
		System.out.println(xp.getExpressionString());
	}

}
