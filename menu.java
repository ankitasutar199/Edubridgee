import java.util.*;
class menu
 {
      public static void main(String args[])
	  {
	  int input;
      Scanner sc = new Scanner(System.in);
	  System.out.println("Enter 1.area of Square ");
	  System.out.println("Enter 2.area of Triangle ");
	  System.out.println("Enter 3.area of Rectangle");
	  input=sc.nextInt();
	  if (input==1)
		 {
	  int A;
	  int a;
      Scanner ab= new Scanner(System.in);
	  System.out.println("Enter the length of square ");
      a=ab.nextInt();
      A= a*a;
      System.out.println("the area of square is"+A);
	      }
	  else if (input==2)
	      {
	  double area;
	  double b, h;
      Scanner bc = new Scanner(System.in);
	  System.out.println("Enter the base and height ");
      b=bc.nextInt();
	  h=bc.nextInt();
      area= (b*h)/2;
      System.out.println("the area of Triangle is"+area);
	       }
	  else if (input == 3)
	      {
	  double rect;
	  double base, height;
      Scanner cd = new Scanner(System.in);
	  System.out.println("Enter the base and height ");
      base=cd.nextInt();
	  height=cd.nextInt();
      rect= base * height;
      System.out.println("the area of Rectangle is" +rect);
	      }
	  else{
	  System.out.println("Enter the valid numbers");
	  }
	  }
}
	  
	  
	  	  