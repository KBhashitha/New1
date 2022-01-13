class HelloWorld3//class with in the class
{
static String name="bhashitha";
public static void main(String [] args)
{
System.out.println("HelloWorld");
HelloWorld2.disp();
HelloWorld2.show();
HelloWorld2 c=new HelloWorld2();//create object
c.disp2();

}
}
class HelloWorld2
{
	void disp2()//nonstatic method
	{
		System.out.println(HelloWorld3.name);
	}
static void disp()//method
{
System.out.println(HelloWorld3.name);
}
static void show()//method
{
	System.out.println(HelloWorld3.name);
}

}
