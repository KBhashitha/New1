class Program9//(to display given number is 2 digit)
{
public static void main(String []args)
{
int x=110000;
String result=(x>=1000 && x<=10000)?"4 digit":((x>=100 &&x<=1000)?"3 digit":((x>=10 && x<=100)?"2 digit":"invalid"));
System.out.println(result);
}
}
