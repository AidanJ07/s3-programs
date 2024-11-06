import java.util.*;

public class arithmetic {
	public static void main( String[] args) {
		Scanner sc = new Scanner(System.in);
		
	try {
	System.out.println("Enter the numerator: ");
	int a=sc.nextInt();
	System.out.println("Enter the denominator: ");
	int b=sc.nextInt();
	int result=a/b;
	System.out.println("Result: "+result);
	}
	
	catch (ArithmeticException e) {
	System.out.println("Caught Arithmetic Exception: "+e.getMessage());
	}
	
	try {
	int[] arr= new int[5];
	System.out.println("The size of the array is 5");
	System.out.println("Enter the index of array you want to access:");
	int index=sc.nextInt();
	System.out.println("Array element: "+arr[index]);
	}
	
	
	catch (ArrayIndexOutOfBoundsException e) {
	System.out.println("Caught ArrayIndexOutOfBoundsException: "+e.getMessage());
	}
	finally {
	System.out.println("Finally block executed. ");
	}
	}}
