import java.util.*;
public class AppendString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		HashMap<String, String> hm =new HashMap<>();
		StringBuilder sb=new StringBuilder();
		 hm.put("shweta", "S");
		 hm.put("aarti", "A");
		hm.put("kirti", "K");
		hm.put("govind", "G");
		for (HashMap.Entry<String,String> hme:hm.entrySet()){
            String s1 = hme.getKey();
            String s2 = hme.getValue();
            sb.append(s1).append(s2);
        }
        System.out.println(sb);
	}

}
