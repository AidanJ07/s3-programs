import java.util.*;
public class palindrome
{
	public static void main(String args[])
	{
		int i,n,temp,org,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
		org=n;
		while(n!=0)
		{
			temp=n%10;
			rev=(rev*10)+temp;
			n=n/10;
		}
		System.out.println("REVERSED NO IS \n"+rev);
		if(org==rev)
		{
			System.out.println("PALINDROME \n");
		}
		else
		{
			System.out.println("NOT PALINDROME \n");
		}
	}
}
