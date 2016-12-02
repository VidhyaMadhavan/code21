import java.util.*;
class seed
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,rem=0,sum=1,num,total=0;
n=sc.nextInt();
num=n;
while(n!=0)
{
rem=n%10;
sum *=rem;
n=n/10;
}
total=num*sum;
System.out.println("seed number is:"+total);
}
}
