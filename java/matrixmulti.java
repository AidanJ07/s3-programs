import java.util.*;
public class matrixmulti{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter order of first matrix:");
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.println("Enter order of second matrix:");
		int p=sc.nextInt();
		int q=sc.nextInt();
		int[][]A=new int[m][n];
		int[][]B=new int[p][q];
		int[][]C=new int[m][n];
		if(n!=p)
		{
			System.out.println("NOT POSSIBE \n");
		}
		else
		{
		System.out.println("Enter elements of first matrix: ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter elements of second matrix: ");
		for(int i=0;i<p;i++)
		{
			for(int j=0;j<q;j++)
			{
				B[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<q;j++)
			{
			for(int k=0;k<n;k++)
				C[i][j]=C[i][j]+A[i][j]*B[i][j];
			}
		}
		
		
		System.out.println("Multiplication of matrices \n");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<q;j++)
			{
				System.out.print(C[i][j]+"\t");
			}
			System.out.print("\n");
		}
		}
		}
	}
	
