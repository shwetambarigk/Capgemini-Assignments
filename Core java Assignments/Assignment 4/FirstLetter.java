import java.util.ArrayList;
import java.util.function.Consumer;
public class FirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list =new ArrayList<>();
		StringBuilder s=new StringBuilder();
		 list.add("shweta");
		 list.add("aarti");
		list.add("atharv");
		list.add("govind");
		Consumer<String> first = (i) -> s.append(i.charAt(0));  //.forEach(s -> System.out.println(s));
	
		for(String a:list) {
			first.accept(a);
		}
		System.out.println(s);
	}
	

}
