import java.util.Scanner;

public class ArmRange {

	public static void main(String[] args) {
		int num, i, rem, temp, counter=0;
		


		//generate Armstrong numbers between start and end
		for(i=100; i<=199; i++)
		{
		   temp = i;
		   num = 0;
		   while(temp != 0)
		   {
			rem = temp%10;
			num = num + rem*rem*rem;
			temp = temp/10;
		   }
		   if(i == num)
		   {
			if(counter == 0)
			{
			   System.out.print("Armstrong Numbers Between 100 and 199: ");
			}
			   System.out.print(i + "  ");
			   counter++;
		   }
		}
		// if no Armstrong number is found
		if(counter == 0)
		{
		   System.out.print("There is no Armstrong number Between 100 n 199");
		}
	    }
	

}
