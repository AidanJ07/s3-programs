import java.util.*;
class student{
	int rollno;
	String name;
	void insertrecord(String name, int rollno){
	this.name=name;
	this.rollno=rollno;
	}
	void displayInfo(){
	System.out.println("Name: "+name);
	System.out.println("Rollno: "+rollno);
	}}
	
	public class exp33{
	public static void main(String args[]){
	student s1=new student();
	student s2=new student();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name: ");
	String name=sc.next();
	System.out.println("Enter rollno: ");
	int rollno=sc.nextInt();
	s1.insertrecord(name,rollno);
	s1.displayInfo();
	System.out.println("Enter name 2: ");
	String name1=sc.next();
	System.out.println("Enter rollno 2: ");
	int rollno1=sc.nextInt();
	s2.insertrecord(name1,rollno1);
	s2.displayInfo();
	}}
