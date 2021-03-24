import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
       
		int c=0, a, temp, n;
		 Scanner scan = new Scanner(System.in);
			
	        System.out.print("Enter any Positive Number : ");
	        n = scan.nextInt();
			
		temp=n;
		while(n>0) {
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c)
        System.out.println("This is Armstrong number!!!");
		else
	        System.out.println("This is Not an Armstrong number!!");

	}

}