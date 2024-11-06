import java.util.*;
public class stringrev{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the word: ");
	String a=sc.nextLine();
	String reverse="";
	int n=a.length();
	for(int i=n-1;i>=0;i--)
	{
		reverse+=a.charAt(i);
	}
	System.out.println("Reversed string: \n"+reverse);	
	}
}
