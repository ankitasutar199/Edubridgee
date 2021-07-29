import java.util.Scanner;
  class Lms1
{
       void AdminLogin()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("          enter username               ");
		String keyusername=scanner.nextLine();
		System.out.println("           enter Password                ");
		String keypassword=scanner.nextLine();
		//scan.close();
	
		if("ankita".equals(keyusername) && "pass123".equals(keypassword))
		{
		       System.out.println("             Username & password Enterd Correctly         ");
		}
		else 
		{
		       System.out.println("              Wrong Username & password                     ");
		}
	
	}
       
     void AdminAccess() 
	{
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("                           Please Enter options 1-4                   ");
		System.out.println("                           1.Add Librarian                             ");
		System.out.println("                           2.View  Librarian                           ");
		System.out.println("                           3.Delete Librarian                          ");
		System.out.println("                           4.Logout                                     ");
		int input=sc.nextInt();
		//void get L_details()
		
		switch(input) 
		{
		case 1:
		    Library1  n1 = new Library1();
			n1.add();
			break;
		case 2:
			int L_id1=1234;
			String L_name1="ABCD";
			System.out.println(" Librarian id :-   " +L_id1 + "  Librarian name   " +L_name1 );
		case 3:
			System.out.println(" ");
		case 4:
			 System.exit(0);
			 break;
		default:
			System.out.println("Please enter the correct option");
			
			
			
		}
	}
	
 class Library1
	{
		
		static String str,b,date,name;
		static int bookno,a,c,book_id,x;
		float price;
		void add()
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the book name ");
			 str=sc.nextLine();
			System.out.println("Enter the book price ");
			 price=sc.nextFloat();
			System.out.println("Enter the book_no " );
			 bookno=sc.nextInt();
			
		}}

public class Librarymgt
{
public static void main(String args[])
	{
		System.out.println("***********    WELCOME TO LIBRARY MANAGEMENT SYSTEM      ************");
		Scanner scan=new Scanner(System.in);
		System.out.println("                        1.Admin Login                     ");
		System.out.println("                        2.Librarian Login                 ");
		int number=scan.nextInt();
			if(number==1) 
			{
				while(true)
				{
					Lms1 l=new Lms1();
					l.AdminLogin();
					l.AdminAccess();
					break;
				}
			
		   }
	}
}
}	
	
	
	

