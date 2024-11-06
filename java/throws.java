import java.util.Scanner;
public class throwthrows{
	public static void findClass(String className) throws ClassNotFoundException{
	if (!className.equals("com.example.ExistingClass")) {
	throw new ClassNotFoundException("Class" + className+ "not found. ");
	}
	else {
	System.out.println("Class" + className+ "found successfully!");
	}
	}
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	
	try {
	System.out.println("Enter the class name to search for");
	String className=sc.nextLine();
	findClass(className);
	}
	
	catch(ClassNotFoundException e) {
	System.out.println("Caught Exception:" +e.getMessage());
	}
	
	finally {
	System.out.println("Finally block executed. ");}
	
	System.out.println("Program continues...");
	sc.close();
	}
	}
