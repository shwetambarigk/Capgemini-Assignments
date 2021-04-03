import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

//import com.sun.tools.javac.code.Attribute.Array;
public class PredicateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> people = Arrays.asList(
				new Person("shweta","Kulkarni", 22),
				new Person("aarti","chopra", 40),
				new Person("chetan","patil", 60),
				new Person("govind","chikka", 23)

				);
		
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		System.out.println("Printing all persons in list....");
		printConditionally(people, p -> true);
		System.out.println("Printing persons name last name starts with c");
		printConditionally(people, p -> p.getLastName().startsWith("c"));
		System.out.println("Printing persons name first name starts with c");
		printConditionally(people, p -> p.getFirstName().startsWith("c"));
	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
	
		for(Person p: people) {
			if(predicate.test(p)) {
				System.out.println(p);
			}
		}
	}
}
