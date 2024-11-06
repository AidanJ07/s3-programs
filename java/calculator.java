import java.util.*;
public class calculator
{
	public static void main(String args[])
	{
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first operand");
		int a=sc.nextInt();
		System.out.println("Enter the second operand");
		int b=sc.nextInt();
		
			System.out.println("Choose an operation to perform");
			System.out.println("1.Addition\n");
			System.out.println("2.Subtraction\n");
			System.out.println("3.Multiplication\n");
			System.out.println("4.Division\n");
			System.out.println("5.Exit\n");
			System.out.println("Enter your choice: ");
			int ch=sc.nextInt();
			
			switch(ch)
			{
				case 1:
					System.out.println("The sum is: "+(a+b));
					break;
				case 2:
					System.out.println("The difference is: "+(a-b));
					break;
				case 3:
					System.out.println("The product is: "+(a*b));
					break;
				case 4:
					System.out.println("The quotient is: "+(a/b));
					break;
				case 5:
					System.out.println("Exiting the program..\n");
					break;
				default:
					System.out.println("Invalid choice \n");}
					}
				catch(InputMismatchException e)
				{
					System.out.println("Caught InputMismatchException: "+e.getMessage());
				}
				catch(ArithmeticException e)
				{
					System.out.println("Caught ArithmeticException: "+e.getMessage());
				}
				finally
				{
					System.out.println("Program executed\n");
				}
			}
		}
				
