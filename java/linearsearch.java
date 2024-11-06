import java.util.*;
public class linearsearch
{
	public static void main(String args[])
	{
		int i,size,search,flag=0,loc=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		size=sc.nextInt();
		int Arr[]=new int[size];
		System.out.println("Enter the elements of the array: ");
		for(i=0;i<size;i++)
		{
			Arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched: ");
		search=sc.nextInt();
		for(i=0;i<size;i++)
		{
			if(search==Arr[i])
			{
				flag++;
				loc=i+1;
			}
		}
		if(flag!=0)
		{
			System.out.println("Element found at position "+loc);
		}
		else
		{
			System.out.println("Element not found");
		}
	}
}
