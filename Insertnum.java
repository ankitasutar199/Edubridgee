import java.util.Scanner;
public class Insertnum 
{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int a[]= {1,2,3,4,5,6,7,8,9,10};
			int location=0;
			int search;
			System.out.println("Enter the search element ");
			search=sc.nextInt();
			int k = 0;
			for(int i=0;i<10;i++)
			{
				if ( a[i]==search)
					{
						k=1;
						location = a[i-1];
					}
			}
			if (k==1)
				{
					System.out.println("The Element " +search + " is present at "  +location + " location" );
				}
		
			else
				{
				System.out.println("Element is not present");
				}
			}

	}


}
