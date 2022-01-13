class Program16
{
public static void main(String []args)
{
console con= System.console();
System.out.println("enter the name");
String name=con.readLine();
System.out.println("please enter the password");
char Pass[]=con.readPassword();
String Password=new String (Pass);
}
}
