package springque_10;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static ApplicationContext context;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("spring.xml");
		App obj = (App) context.getBean("app");
		obj.run();
		((AbstractApplicationContext) context).registerShutdownHook();
	}
}