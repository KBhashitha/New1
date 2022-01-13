public class Program12
{
public static void main(String []args)
{
/*int i,j;//(to display right angle pattern)
for(i=1;i<5;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(j);
}
System.out.println();
}*/
/*int i,j,row=4;
for (i=0;i<4;i++)
{
	for(j=0;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
for(i=3;i>=0;i--)
{
	for(j=0;j<=i;j++)

	{
	System.out.print("*");
		
	}
	System.out.println();
}*/
int i,j,row=6;//(to display left angle pattern)
for(i=0;i<row;i++)
{
for(j=2*(row-i);j>=0;j--)
{
System.out.print(" ");
}
for(j=0;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
/*int i,j;
for(i=4;i>=0;i--)
{
	for(j=0;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}*/
/*int i,j;
for(i=5;i>=2;i--)
{
	for(j=0;j<i;j++)
	{
		System.out.print("*");
	}
	System.out.print("\n");
}
for(i=5;i>=1;i--)
{
	for(j=0;j<i;j++)
	{
		System.out.print("*");
	}
	System.out.print("\n");
}*/
/*int i,j,number,n=5;
for(i=0;i<n;i++)
{
	number=1;
	for(j=0;j<=i;j++)
	{
		System.out.print(number +"");
	}
	System.out.println();
}*/
/*int i;
int j;
for (i=5;i>=1;i--)
{
	for(j=1;j<=i;j++)
	{
		System.out.print(j);
	}
	System.out.println();
}*/

/*int i,j;
for(i=0;i<5;i++)
{
	for(j=1;j<=i;j++)
	{
		System.out.print(j);
	}
	System.out.println("0");
}*/
/*for (int i=0;i<=10;i++)
{
	for (int j=0;j<=10;j++)
	{
	System.out.println(i+ " "+j);
	
}
}*/
/*int i,j;
for(i=1;i<5;i++)
{
	for(j=0;j<i;j++)
	{
		System.out.print(i+j*1);
	}
	System.out.println();
}*/

}
}



