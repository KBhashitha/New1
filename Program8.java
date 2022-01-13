import java.util.Scanner;
class Program8//(to display given number is 2 digit)
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
System.out.println("To display  number ");
int x=sc.nextInt();
if (x>=0 && x<=9)
{
	System.out.println("To display given number is single digit number");
}
else if(x>=10 && x<=99)
{
	System.out.println("to display given number is two digit number");
}
else if(x>=99 && x<=999)
{
	System.out.println("To display given number is three digit number");
}
else if(x>=999 && x<=1100)
{
	System.out.println("To display given number is four digit number");
}
else{
	System.out.println("To display given number is other number");
}

}
}
