import java.io.Console;
class Program16
{
public static void main(String []args)
{
Console con= System.console();
System.out.println("enter the name");
String name=con.readLine();
System.out.println("user entered name>---"+name);
System.out.println("please enter the password");
char Pass[]=con.readPassword();
String Password=new String (Pass);
System.out.println("user enetered password>----"+Password);

}
}
