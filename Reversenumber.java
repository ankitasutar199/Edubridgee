import java.util.Scanner;  
public class Reversenumber  
{  
public static void main(String[] args)   
{  
int x, reverse = 0; 
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of X ");  
       x = sc.nextInt();  
 
while(x != 0)   
{  
int remainder = x % 10;  
reverse = reverse * 10 + remainder;  
x = x/10;  
}  
System.out.println("The reverse of the given number is: " + reverse);  
}  
}  