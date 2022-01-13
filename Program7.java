class Program7//(To check given character is upper case or lowercase)
{
public static void main(String []args)
{

char ch='a';

//int c=(int)ch;
//System.out.println(c);
//int i=97;
//char ch=(char)i;
//System.out.println(ch);
//float myFloat=65.0f;
//char ch=(char)myFloat;
//System.out.println(ch);
if(ch>='A' && ch<='Z')//upper case letter start with 65 to 90

{
	System.out.println("Upper case");
}
else if(ch>='a' && ch<='z')
{
	System.out.println("Lower case");
}

}
}

