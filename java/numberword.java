import java.util.*;
public class numberword
{
	public static void main(String args[])
	{
		int n,i,temp,rev=0,org,temp1,size=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		n=sc.nextInt();
		String[] Arr= new String[]{"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		org=n;
		for(;n>0;n=n/10)
		{
			size++;
		}
		for(i=0;i<size;i++)
		{
			temp=org%10;
			rev=(rev*10)+temp;
			org=org/10;
		}
		System.out.println("The number in words are: ");
		for(i=0;i<size;i++)
		{
			temp=rev%10;
			System.out.println(Arr[temp]);
			rev=rev/10;
		}
	}
}

