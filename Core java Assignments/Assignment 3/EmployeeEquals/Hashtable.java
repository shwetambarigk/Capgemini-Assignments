import java.util.*;
public class HashTableEx 
{
	public static void main(String[] args) 
	{
		Hashtable<EmployeeHashtable,String> ht= new Hashtable<>();
		EmployeeHashtable e1=new EmployeeHashtable("Shweta");
		EmployeeHashtable e2=new EmployeeHashtable("Kulkarni");
		ht.put(e1, "First");
		ht.put(e2, "Second");
		System.out.println(ht);
		
	}

}