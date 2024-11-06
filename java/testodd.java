import java.util.*;

class OddNumberException extends Exception{
public OddNumberException(String message){
super(message);
}}

public class testodd {
	public static void checkForOdd(int number) throws OddNumberException {
		if (number%2!=0) {
		throw new OddNumberException("Odd number detected:" +number);
		}else{
		System.out.println("The number "+number+" is even");
		}}
		public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		try{
			System.out.println("Enter a number: ");
			int num=sc.nextInt();
			
			checkForOdd(num);
		}
		catch(OddNumberException e) {
			System.out.println(e.getMessage());
		}
		finally{
		System.out.println("Odd number check completed.");
		sc.close();
		}
		}
		}
			
			
