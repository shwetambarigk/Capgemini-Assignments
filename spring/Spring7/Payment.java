package springque_7;
 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
 
@Component("payment")
public class Payment {
 
    @Value("#{beanOrder.item}")
    private String itemName;
     
    @Value("#{beanOrder}")
    private Order order;
     
    public void setOrder(Order ord){
        this.order = ord;
    }
     
    public String getItemName() {
        return itemName;
    }
 
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
  
    public Order getOrder() {
        return order;
    }
 
    public void processOrder(){
        System.out.println("Processing order: "+order.getItem());
    }
}