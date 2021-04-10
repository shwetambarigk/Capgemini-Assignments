package springque_8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static ApplicationContext context;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("spring.xml");
		InitialisationB obj = (InitialisationB)  context.getBean("app");
		obj.check();
		((AbstractApplicationContext) context).registerShutdownHook();
	}
}