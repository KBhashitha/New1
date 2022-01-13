class Program15
{
public static void main(String [] args)
{
/*for(int i=1;i<=5;i++)//(To print stars exam)
{
for(int j=0;j<i;j++)
{
System.out.print(" * ");
}
System.out.println();
}*/
/*int n=7;//(to print even or odd)
if(n%2==0)
{
	System.out.println("Even numbers");
}
else if(n%2==1)
{
	System.out.println("odd numbers");
}*/
int x[]={1,2,3,4,5,6,7,8,9,10};//(excluding 6 is doubt)
for(int i=0;i<x.length;i++)
{
	if(x[i]<6 || x[i]>6)
	{
		
		System.out.println("number "+x[i]);
		
	}
	continue;
}
/*for (int i=5;i>0;i--)//(to display 5stars to 1star)
{
	for (int j=0;j<i;j++)
	{
		System.out.print(" * ");
	}
	System.out.println();
}*/
/*int a=10;//(to doubt logical operator with example)
short b=20;
System.out.println("sum of two numbers"+(a&&b));*/
/*int sum=0;//(sum of first five odd numbers)
int x[]={1,3,5,7,9};
for (int i=0;i<x.length;i++)
{
	sum=sum+x[i];
	System.out.println("sum of odd numbers"+sum);
}*/
/*int i=1;//(factorial of number using while loop)
int fact=1;
	while(i<=4)
	{
	fact=fact*i;
	i++;
		}


System.out.println("Factorial of numbers"+fact);*/
/*int x=1;
int n=2;
n=n*x;
System.out.println("prime numbers"+n);*/
}
}
