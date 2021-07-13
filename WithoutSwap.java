import java.util.*;  
class WithoutSwap{   
 public static void main(String arg[]) {  
  
   int x, y; 
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of X and Y");  
       x = sc.nextInt();  
       y = sc.nextInt();  
       System.out.println("before swapping numbers: "+x +"  "+ y);  
       System.out.println("After swapping");  
       x = x + y;  
       y = x - y;  
       x = x - y;  
       System.out.println("value of x:" + x);  
       System.out.println("value of y:" + y);  
 }  
}   