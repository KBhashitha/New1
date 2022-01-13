 class D
{

void m1(int a)
{
	System.out.println(a);
}
}
class E
{
int a=10;
public static void main(String []args)
{
D obj=new D();
F obj1=new F();
E obj2=new E();
obj.m1(obj2.a);
obj1.m2(obj2.a);
}
}

class F
{
void m2(int a)
{
	System.out.println(a);
}
}

