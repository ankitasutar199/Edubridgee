import java.util.Scanner;
public class Hackerrankcode {
	 public static void main(String[] args) 
	 {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the number");
	        int n= sc.nextInt();
	        String ans="";
	        if(n%2==1||n%2==0&& n>5 && n<21){
	          ans = "Weird";
	        }
	        else{

	           if(n%2==0&& n>1 && n<6||n>20){
	          ans = "Not Weird";
	        }

	        }
	        System.out.println(ans);
	        
	       
	        	}
}
