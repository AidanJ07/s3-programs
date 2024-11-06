import java.util.*;
class Person
{
	String name;
	int studentid;
	int age;
	void displayInfo(){
	System.out.println("Student ID: "+age);
	System.out.println("Name: "+name);
	System.out.println("Age: "+age);
}
}
class student extends Person
{
	String grade;
	student(String name, int studentid,int age, String grade){
	super.studentid=studentid;
	super.name=name;
	super.age=age;
	this.grade=grade;
	super.displayInfo();
	System.out.println("Grade: "+grade);
	}
	}
public class singleinheritance
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter details of person: ");
		System.out.println("Enter Student ID: ");
		int studentid=sc.nextInt();
		System.out.println("Enter name of person: ");
		String name=sc.next();
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		System.out.println("Enter grade: ");
		String grade=sc.next();
		
		student std=new student(name,studentid,age,grade);
	}
}

		
