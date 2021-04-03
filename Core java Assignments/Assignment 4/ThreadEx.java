import java.util.ArrayList;
import java.util.function.Consumer;
public class ThreadEx extends Thread {
	 public void runnable(String s){
	        Consumer<String> lambda = i -> System.out.println(i);
	        lambda.accept(s);
	    }
	    public static void main(String[] args) {
	    	ThreadEx thread=new ThreadEx();  
	        ArrayList<String> al = new ArrayList<>();
	        al.add("shweta");
	        al.add("aarti");
	        al.add("kirti");
	        al.add("govind");
	    
	        for(String l:al){
	            thread.runnable(l);
	        }     
	    }
	    
	}
