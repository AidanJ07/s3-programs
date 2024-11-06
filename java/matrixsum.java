import java.util.*;
public class matrixsum{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows and colums");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][]A=new int[m][n];
		int[][]B=new int[m][n];
		int[][]C=new int[m][n];
		System.out.println("Enter elements of first matrix: ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter elements of second matrix: ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				B[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				C[i][j]=A[i][j]+B[i][j];
			}
		}
		
		
		System.out.println("Sum of matrices \n");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(C[i][j]+"\t");
			}
		System.out.print("\n");
		}
	}
}
