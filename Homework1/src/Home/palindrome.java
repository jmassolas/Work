package Home;

public class palindrome {
	public static void main(String[] args)
	{
String a="121";
a.toLowerCase();
StringBuilder s =new StringBuilder(a);
StringBuilder s1 =new StringBuilder(a);
s1=s1.reverse();
if(s.toString().equals (s1.toString()))
{
System.out.println( "It is a palindrome");
}
else
System.out.println("This is not a palindrome");	

}

}
