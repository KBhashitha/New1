import java.util.*;
class Ternarydemo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter  two number");
int a=sc.nextInt();
int b=sc.nextInt();
int big=a>b?a:b;
System.out.println("big value="+big);
}
}