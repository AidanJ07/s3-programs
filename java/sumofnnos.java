import java.util.*;
public class sumofnnos
{
	public static void main(String args[])
	{
		int n,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no: \n");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of numbers is:"+sum);
	}
}
