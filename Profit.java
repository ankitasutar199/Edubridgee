import java.util.*;
class Profit
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the Cost Price");
double cp=sc.nextDouble();
System.out.println("Enter the Selling Price");
double sp=sc.nextDouble();
if ( cp - sp > 0)
{
System.out.println("loss is " +(cp-sp));
}
else if(cp - sp < 0)
{
System.out.println(" Profit is "+(sp-cp));
}
else{
System.out.println("No loss No Profit");
}
}
}

