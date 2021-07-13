import java.util.*;
public class Maxaaray 
{
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
				int arr[] =new int[5];
          System.out.println("enter values ");
			
			for (int  i = 0; i<5; i++)
			{
				arr[i] = sc.nextInt(); // 0 1 2 3 4 -->index
				  if (arr[i] < 0)       // 2 8 4 6 0 --> values
			              System.out.println("Invalid Input");
				  break;
				  
			}
			
			//System.out.println("enter only 5 numbers");
			
			  int evensum=0;  //let  max is 2
	          int oddsum=0 ;
	        for (int i = 0; i < 5; i++) 
	        {  
	             
	           if(arr[i] % 2==0)  
	               evensum = evensum + arr[i];  
	           else
	        	   oddsum= oddsum + arr[i];
	        	   
	        }  
	        System.out.println("addition of even  element present in given array: " + evensum);  
	        System.out.println("addition of odd  element present in given array: " + oddsum);  
			
		}
	}


