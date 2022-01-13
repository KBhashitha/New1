 class A
{
	void sum(int a,int b)
	{
	System.out.println(a+b);
	}
	
}
class B
{
	void multiply(int a)
	{
		System.out.println(a);
		
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
		n.multiply(m.a);
		o.sum(m.a,m.b);
		
	}
}
