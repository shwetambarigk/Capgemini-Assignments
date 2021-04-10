package springque_8;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class InitialisationB {
	
	public void check() {
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
	
	public void destroy() {
	      System.out.println("Bean will destroy now.");
	}

}