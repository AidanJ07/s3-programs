import java.util.*;
class A
{
	int n,i,flag;
	void display()
	{
		for (i=2;i<n;i++)
		{
			if (n%i==0)
			{
				flag++;
			}
		}
		if (flag==0)
		{
			System.out.println("The no is prime\n");
		}
		else
		{
			System.out.println("The no is not prime");
		}
		}}
public class naturalnossum
{
	public static void main(String args[])
	{
		A no=new A();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a no");
		no.n=sc.nextInt();
		no.display();
		}}
