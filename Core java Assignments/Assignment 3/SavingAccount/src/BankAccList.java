import java.util.HashSet;

public class BankAccList {


	public static void main(String[] args)
	{
		HashSet<SavingsAccount> ss = new HashSet<SavingsAccount>();
		SavingsAccount s1=new SavingsAccount(2000, 1211, "Shweta", true);
		SavingsAccount s2=new SavingsAccount(4000, 3245, "Aarti", true);
		SavingsAccount s3=new SavingsAccount(9000, 2199, "Kirti", false);
		s3.updateBalance(0,500);
		ss.add(s1);
		ss.add(s2);
		ss.add(s3);
		for(SavingsAccount sac:ss)
		{
			System.out.println("Account id: " + sac.acc_id +" Account Holder Name: "+sac.accHolderName+ " Balance: "+ sac.acc_balance);
		}

	
	}

}
