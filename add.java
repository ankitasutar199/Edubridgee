import java.util.*;
public class Add 
{
      public static void main(String args[])
	  {
      int x, y ;
	  int z;
	  int s;
	  int m , d ;
	  double r;
      Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the value of x & y ");
      x=sc.nextInt();	  
      y=sc.nextInt();
	  z = x + y;
	  s= x- y;
	  m = x * y;
	  d= x/y;
	  r=x % y;
	  System.out.println("the addition is " +z);
	  System.out.println("the subtraction is " +s);
	  System.out.println("the mulitiplication is " +m);
	  System.out.println("the division " +d);
	  System.out.println("the modulus 1 is " +r);
	  }
	  }
	  