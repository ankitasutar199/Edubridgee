import java.util.*;
class Perfectnum
{
public static void main(String args[])
{
int i,num;
int sum=0;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number");
num=sc.nextInt();
for(i=1;i<num; i++)
{
if(num % i==0)
{
sum=sum+i;
}
}
if(sum==num)
{
System.out.println("it is a perfect number" +num);
}
else{
System.out.println("its not the perfect number" +num);
}
}
}


