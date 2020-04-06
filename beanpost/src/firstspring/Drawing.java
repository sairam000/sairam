package firstspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext Context=new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle=(Triangle)Context.getBean("triangle");
		triangle.draw();

	}

}
