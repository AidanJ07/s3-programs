import java.util.*;

public class exp61{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a line of integers: \n");
		String line=sc.nextLine();
		StringTokenizer strtok=new StringTokenizer(line);
		int sum=0;
		System.out.println("The integers are: ");
		while(strtok.hasMoreTokens()){
		String token=strtok.nextToken();
		try
		{
			int number=Integer.parseInt(token);
			System.out.println(number);
			sum+=number;}
		catch(NumberFormatException e){
			System.out.println("Invalid integer: "+token); }
			}
		System.out.println("Sum of all integers: "+sum);
		sc.close();
		}
}
