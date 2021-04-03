import java.util.ArrayList;
//import java.util.List;
public class OddLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list =new ArrayList<>();
			 list.add("shweta");
			 list.add("aarti");
			list.add("atharv");
			list.add("govind");

			list.removeIf((i) -> ((i.length())%2!=0));
			System.out.println(list);
			
	}

}
