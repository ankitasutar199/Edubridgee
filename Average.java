import java.util.Scanner;  
public class Average {  
   public static void main(String[] args)  
    {  
      int n, count = 1;   
      float  x, average, sum= 0;   
      Scanner sc = new Scanner(System.in);     
      System.out.println("Enter the value of numbers");  
      n = sc.nextInt();  
      while (count <= n)   
             {   
                  System.out.println("Enter the "+count+" number?");  
                  x = sc.nextInt();  
                  sum += x;   
                  ++count;   
             }   
                  average = sum /n;   
        System.out.println("The Average is"+average);  
    }    
}  