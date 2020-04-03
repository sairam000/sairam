package firstspring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Drawing {

	public static void main(String[] args) {
		//Rectangle rectangle=new Rectangle();
		
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Rectangle rectangle=(Rectangle)context.getBean("rectangle");
		rectangle.draw();
		
	}

}
