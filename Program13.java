class Program13
{
public static void main(String [] args)
{
/*int x[]={1,5,4,6,7,8,9};//(To sum of array elements)
int sum=0;
for(int i=0;i<x.length;i++)
{	
sum=sum+x[i];
System.out.println(sum);
}*/

/*int x[]={1,5,4,6,7,8,9};//(To sum of even numbers)
int sum=0;
for(int i=0;i<x.length;i++)
{
	
if(x[i]%2==0)
{
	sum=sum+x[i];
	System.out.println("Even number " +x[i]);
}
else
{
	System.out.println("odd number "+x[i]);
}

	System.out.println(sum);
}*/


/*int x[]={-1,5,-4,6,-7,8,9};//(To display negative values from given array)
for(int i=0;i<x.length;i++)
if(x[i]<=0)
{
System.out.println("negative number"+x[i]);
}
	else if(x[i]>0)
	{
		System.out.println("Positive number"+x[i]);
	}
	
	else
	{
		System.out.println("zero");
	}
	*/
	/*int x=10;//(Swaping of two numbers)
	int y=30;
	//System.out.println(x);
	
	int tem=0;
	tem=x;
	x=y;
	y=tem;
	//System.out.println(x);
	System.out.println(y);*/

/*for(int val:x)//(By using for each loop)
System.out.println(val);
*/
/*int x[]={2,4,6,8,10};//(To display first and last element in the array)
System.out.println(x[0]);
System.out.println(x[4]);*/
/*int x[]={30,1,-1,3,9,5,0};//(Ascending order)
for (int i=0;i<x.length;i++)
{
	for (int j=i+1;j<x.length;j++)
	{
		int temp=0;
		if (x[i]<x[j])
		{
			temp=x[i];
			x[i]=x[j];
			x[j]=temp;
		}
		}
}
for (int value:x)
{
System.out.println(value);
	}*/
/*int x[]={30,1,-1,3,9,5,0};//(Descending order)
for (int i=0;i<x.length;i++)
{
	for (int j=i+1;j<x.length;j++)
	{
		int temp=0;
		if (x[i]>x[j])
		{
			temp=x[i];
			x[i]=x[j];
			x[j]=temp;
		}
		}
}
for (int value:x)
{
System.out.println(value);
}*/
/*int x[]={30,1,-1,3,9,5,0};//(2nd least value & 2nd biggest number)
for (int i=0;i<x.length;i++)
{
	for (int j=i+1;j<x.length;j++)
	{
		int temp=0;
		if (x[i]<x[j])
		{
			temp=x[i];
			x[i]=x[j];
			x[j]=temp;			
		}
		}
}
System.out.println(x[5]);
System.out.println(x[1]);*/
	/*for(int i=0;i<10;i++)//(continue using)
	{
		if(i<3)
		{
			continue;
		}
		else if(i>5)
		{
			continue;
		}
		
		System.out.println(i);*/
		int y[]={-1,0,11,90,-3,0};//(To display +ve numbers in given array)
		for(int i=0;i<y.length;i++)
		{
			if(y[i]>=0)
			{
				System.out.println("positive number:"+y[i]);
			}
			else if(y[i]<0)
			{
				System.out.println("negative number:"+y[i]);
			}
			
		}
	
	
	
}
}
