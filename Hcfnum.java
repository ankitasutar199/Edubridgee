import java.util.*;
class Hcfnum
{
public static void main(String args[])
{
int i,a,b,hcf=0;
System.out.println("Enter the two numbers");
Scanner sc= new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
for(i=1; i<=a  || i<=b ; i++)
{
if (a%i==0 && b%i==0) 
hcf=i;
}
System.out.println("the hcf of two number is" +hcf);
}
}


