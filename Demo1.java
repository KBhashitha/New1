class Demo1(Static variable and static method)
{
	static int x=10;
	static void access()
	{
		System.out.println("x= "+x);
	}
}
class Demo
{

public static void main(String[] args)
{
	Demo1.access();
}
}
