import java.util.Scanner;
  class Lms
{
       void LibrarianLogin()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("          enter username               ");
		String keyusername=scanner.nextLine();
		System.out.println("           enter Password                ");
		String keypassword=scanner.nextLine();
		//scan.close();
	
		if("Librarian".equals(keyusername) && "pass123".equals(keypassword))
		{
		       System.out.println("             Username & password Enterd Correctly         ");
		}
		else 
		{
		       System.out.println("              Wrong Username & password                     ");
		}
	
	}
       
     void LibrarianAccess() 
	{
		
		
		Scanner sc=new Scanner(System.in);
		 System.out.println("***Welcome to the library management system***");
		System.out.println("                           Please Enter options 1-4                   ");
		System.out.println("                           1.View Books                           ");
		System.out.println("                           2.Add Book                        ");
		System.out.println("                           3.Issue Book                           ");
		System.out.println("                           4.Return Book                                    ");
		System.out.println("                           5.Delete Book                                    ");
		System.out.println("                           6.Exit                                  ");
		int input=sc.nextInt();
		//void get L_details()
		
		switch(input) 
		{
		case 1:
			Library1 n3=new Library1();
			n3.View_Books();
			System.out.println("View  Books ");
		   
			break;
		case 2:
			 Library1  n1 = new Library1();
			 n1.add();
			break;
		case 3:
			Library1 n2=new Library1();
			n2.issue();
			case 4:
			System.out.println("Return Book ");
		case 5:
			System.out.println("Search Book ");
		case 6:
			 System.exit(0);
			 break;
		default:
			System.out.println("Please enter the correct option");
			
			
			
		}
	}
}
	
  class Library1  extends Lms
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
			System.out.println("Enter the book_ID " );
			 bookno=sc.nextInt();
			 System.out.println("Your book is added to library.");
			 System.out.println( "Your Book Nmae is: " +str +"   "+ "Book Price: " + price +"    "+  " Book No. "  +bookno);
			 System.out.println("press 0 to go back Home: ");
			 int num=sc.nextInt();
			 if(num==0) {
	            while(true){
					LibrarianAccess();}
					}
		}
	
		void issue()
		{
			Scanner sc1 =new Scanner(System.in);
			System.out.println("Enter the book name ");
			 str=sc1.nextLine();
			System.out.println("Enter the book ID " );
			 a=sc1.nextInt();
			System.out.println("Enter the book issue date ");
			 b=sc1.nextLine();
			System.out.println("Enter the number of books issued ");
			 c=sc1.nextInt();
			System.out.println("Return book date ");
			date=sc1.nextLine();
			 System.out.println("press 0 to go back Home:  ");
			 int num=sc1.nextInt();
			 if(num==0) {
	            while(true){
					LibrarianAccess();}
					}
			
		}
		
		void View_Books()
		{
			
			System.out.println("Book_Id Book_Name  Author_Nmae  ");
			int  id[]= {01, 02, 03, 04, 05, 06};
			String B_name[]= {"  java ", "  python", "  C  ", "  C++", "  Perl", "  .net "};
			String Author_nm[]= {"  SunMicro", "  Albert" , "  Syntel","  Edureka", "  Microsoft", "  Lenovo" };
			for(int i=0;i<=5;i++)
			{
				
						System.out.println(id[i] +"  "  +B_name[i] +"   "   +Author_nm[i]);
			}
			System.out.println("press 0 to go back Home:  ");
			Scanner sc1 =new Scanner(System.in);
			 int num=sc1.nextInt();
			 if(num==0) {
	            while(true){
					LibrarianAccess();}
					}
		
	}
	}

public class Library
{
public static void main(String args[])
	{
		System.out.println("***********    Book Management System Login     ************");
		Scanner scan=new Scanner(System.in);
		System.out.println("                        1.Librarian  Login                     ");
		System.out.println("                        2.Admin      Login                 ");
		int number=scan.nextInt();
			if(number==1) 
			{
				while(true)
				{
					Lms l=new Lms();
					l.LibrarianLogin();
					l.LibrarianAccess();
				}
			
		   }
	}
}

	
	
	

