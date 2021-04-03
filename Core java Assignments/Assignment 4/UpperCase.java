import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.UnaryOperator;

public class UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<>(Arrays.asList("shweta", "aarti", "atharv", "govind"));
        
        System.out.println(list);
         
        list.replaceAll( new MyOperator() );  
         
        System.out.println(list);
	}

}
class MyOperator implements UnaryOperator<String> 
{
    @Override
    public String apply(String t) {
        return t.toUpperCase();
    }
}