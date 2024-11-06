import java.util.Scanner;
class Student{
	int roll,phyMark,chemMark,mathMark;
	String name;
	Scanner scan=new Scanner(System.in);
	void getRequiredDetails(){
		System.out.print("Enter Name: ");
		name=scan.next();
		System.out.print("Enter roll number: ");
		roll=scan.nextInt();
		System.out.print("Enter Physics Marks: ");
		phyMark=scan.nextInt();
		System.out.print("Enter Chemistry Marks: ");
		chemMark=scan.nextInt();
		System.out.print("Enter Maths Marks: ");
		mathMark=scan.nextInt();
	}
	void displayAverage(){
		float avg=(phyMark+chemMark+mathMark)/3;
		System.out.println("Average Marks: "+avg);
	}
}

public class additional{
	public static void main(String[]args){
		Student s =new Student();
		s.getRequiredDetails();
		s.displayAverage();
	}
}

