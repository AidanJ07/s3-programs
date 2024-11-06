import java.util.*;
public class frequency{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
String input =sc.nextLine();
System.out.print("Enter a letter to find its frequeny: ");
char letter = sc.next().charAt(0);
int freq=0;
for(int i=0;i<input.length();i++)
	{
		if(input.charAt(i)== letter)
	{
	freq++;
	}
	}
	System.out.println("The letter " + letter+" appear "+freq+" times");
	}
	}
