import java.util.*;
public class stringpalindrome{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter string:");
String a=sc.nextLine();
String e="";
int n=a.length();
for(int i =n-1;i>=0;i--)
{
	e+=a.charAt(i);
}
if(a.equals(e))
{
	System.out.println("Is a palindrome");
}
else
{
	System.out.println("It is not palindrome");
}
}
}
