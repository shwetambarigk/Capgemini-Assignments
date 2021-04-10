package springque_7;
 
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.java2novice.beans.PaymentGateway;
 
public class Main{
 
    public static void main(String a[]){
        String confFile = "applicationContext.xml";
        ConfigurableApplicationContext context 
                                    = new ClassPathXmlApplicationContext(confFile);
        PaymentGateway gateway = (PaymentGateway) context.getBean("paymentGateway");
        gateway.processOrder();
    }
}