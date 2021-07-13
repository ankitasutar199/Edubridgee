import java.util.*;
public class TCSprg2 
{
	public static void main(String args[])
	{
		int number;
		int productdigit=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the distance that u travelled");
		number=sc.nextInt();
		if (number < 0 || number > 32767)
		{
			System.out.print(" Invalid Input");
		}
		else 
		{
			while(number !=0)
			{
			int rem = number % 10 ;
			productdigit =   productdigit   * rem ;
		    number= number/10; 
			}
			System.out.print(+ productdigit);
			//System.out.println();
			
		}
		
	}

}
