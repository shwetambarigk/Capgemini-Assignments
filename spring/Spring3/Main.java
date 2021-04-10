package springque_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	private static ApplicationContext context;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("spring.xml");
		BankAccountRepositoryImpl bank = (BankAccountRepositoryImpl) context.getBean("Accounts");
		bank.getBalance(111);
		bank.updateBalance(111, 100);
		
		BankAccountServiceImpl obj = (BankAccountServiceImpl) context.getBean("BankAccountService");
		obj.withdraw(111, 200);
}
}