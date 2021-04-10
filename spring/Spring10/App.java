package springque_10;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;

public class App implements InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware{
	
	private ApplicationContext context = null;
	
	public void run() {
		System.out.println("Application1 is running");
	}
	
	public void init(){
	      System.out.println("Bean is going through init.");
	}
	
	@PostConstruct
	public void start(){
	      System.out.println("Application is init.");
	}
	@PreDestroy
	public void end() {
	      System.out.println("Application is destroy.");
	}
	
	public void cleanUp() {
	      System.out.println("In destroy method");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("running interface");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub	
		System.out.println("destroy interface");
	}

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// TODO Auto-generated method stub
//		System.out.println("from aware interface");
		this.context = context;
	}

	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Bean name is: "+name);
		
	}

}