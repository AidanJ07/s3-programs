import java.util.*;
class Employee{
String name;
int employeeid;
String department;
                                                                                       
       Employee(String name, int employeeid, String department){
       
this.name = name;
this.employeeid = employeeid;
this.department = department;
}

void display(){

System.out.println(" Name:"+name);
System.out.println(" Empid:"+employeeid);
System.out.println(" Department:"+department);

}
}

class Manager extends Employee{

int num;
String projectname;


Manager(String name, int employeeid, String department, int num, String projectname){
super(name,employeeid,department);

this.num = num;
this.projectname=projectname;
}
void display(){
super.display();
System.out.println(" Number of Team Members:"+num);
System.out.println(" Project Name:"+projectname);
}
}
class Intern extends Employee{
String university;
int dur;
double stipend;

Intern( String name, int employeeid, String department, String university, int dur, double stipend){
super(name, employeeid, department);
this.university= university;
this.dur = dur;
this.stipend=stipend;
}

void display(){
super.display();
System.out.println(" Enter the universiy name :"+university);
System.out.println(" Enter the duration :"+dur);
System.out.println(" Enter the stipend:"+stipend);
}}

public class exp44{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter manager details");
System.out.println("Enter the name:");
String name = sc.next();
System.out.println("Enter the Empid:");
int employeeid = sc.nextInt();
System.out.println("Enter Department:");
String department = sc.next();
System.out.println("Enter Number of team mates:");
int num= sc.nextInt();
System.out.println("Enter Project Name:");
String projectname= sc.next();

Manager manager = new Manager( name,  employeeid,  department, num,  projectname);
manager.display();

System.out.println("Enter intern details");
System.out.println("Enter the name:");
String name1 = sc.next();
System.out.println("Enter the Empid:");
int employeeid1 = sc.nextInt();
System.out.println("Enter Department:");
String department1 = sc.next();
System.out.println(" Enter the university:");
String university1 = sc.next();
  System.out.println("Enter duration:");
int dur1= sc.nextInt();
System.out.println("Enter stipend:");
double stipend1= sc.nextInt();

Intern intern = new Intern( name1,employeeid1,  department1, university1, dur1,  stipend1);
intern.display();
}}
