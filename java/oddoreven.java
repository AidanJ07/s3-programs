import java.util.*;
public class oddoreven
{
	public static void main(String args[])
	{
		int n,i,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to be checked");
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}
	}
}
