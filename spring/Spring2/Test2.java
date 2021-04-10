package springque_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
	
	private static ApplicationContext context;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		context = new ClassPathXmlApplicationContext("bean.xml");
		Collection collectionc = (Collection) context.getBean("collection");
		collectionc.showList();
		System.out.println(" ");
		collectionc.showSet();
		System.out.println(" ");
		collectionc.showMap();
	}

}
