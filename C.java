 class A
{
void sum(int a,int b)// When we are return the value we want to write int
	{
		//int d=a+b;
	System.out.println(a+b);
	return a+b;
	}
	
}
class B
{
void multiply(int a,int b)
	{
		//int e=a*b;
		System.out.println(a*b);
		return a*b;
	}
	
}
class C
{
	int a=10;
	int b=20;
	public static void main(String []args)
	{
		C m=new C();
		B n=new B();
		A o=new A();
		n.multiply(m.a,m.b);// when we return we want to declare in int variable)
		o.sum(m.a,m.b);
		//System.out.println(d);
		//System.out.println(e);
		
		
	}
}
