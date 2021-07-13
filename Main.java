import java.util.Scanner;  
public class Main  
 {  
   public static void main (String args[])  
    {  
	float p, r,  t,  si;
Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of p and r and t ");  
       p= sc.nextFloat();
	   r= sc.nextFloat(); 	
	   t= sc.nextFloat(); 	
	   si  = (p*r*t)/100;   
       System.out.println("Simple Interest is: " +si);  
    }
	}  