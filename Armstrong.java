import java.util.*;
class Armstrong
{
public static void main(String args[])
{
int number =371, orgnum,rem,result=0;
orgnum=number;
while(orgnum!=0)
{
  rem=orgnum%10;
  result +=Math.pow(rem,  3);
  orgnum /=10;
  }
if(result==number)
System.out.println(number +" is an armstrong number");
else
System.out.println(number  +" is not an armstrong number");
}
}
