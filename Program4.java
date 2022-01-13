//import java.util.Scanner;
class Program4//(To display leap year)
{
public static void main(String [] args)
{
//Scanner sc=new Scanner(System.in);
//System.out.println("enter a year");
//int Year=sc.nextInt();
int year=2000;
if(((year % 4==0) && (year %100 !=0)) ||(year % 400 ==0))
{
System.out.println("Leap year");
}
else
{
System.out.println("Not a leap year");
}
}
}
