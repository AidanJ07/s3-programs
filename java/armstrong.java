import java.util.*;
public class armstrong
{
	public static void main(String args[])
	{
		int n,org,temp,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		n=sc.nextInt();
		org=n;
		while(n>0)
		{
			temp=n%10;
			rev=rev+(temp*temp*temp);
			n=n/10;
		}
		if(rev==org)
		{
			System.out.println("NUMBER IS ARMSTRONG");
		}
		else
		{
			System.out.println("NUMBER IS NOT ARMSTONG");
		}
	}
}
