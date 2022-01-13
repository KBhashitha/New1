import java.util.Scanner;
class Program6//(To lovers is eligible for marriage or not)
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the bride age");
	System.out.println("enter the bridegroom age");
	int b=sc.nextInt();
	int bg=sc.nextInt();
if(b>=21 && bg>=18)
{
System.out.println("Bride and Bridegroom are eligible to get marriage");
}
else if(b>=21 && bg<=18)
{
System.out.println("Bridegroom age is not matching not eligible to attend the marriage");
}
else if (b<=21 && bg>=18)
{
System.out.println("Bride age is not matching not eligible to attend the marriage");
}
}
}

