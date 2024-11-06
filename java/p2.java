import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    int getMarks() {
        return marks;
    }
}

public class p2	 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        Student[] students = new Student[5];
       
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = sc.nextLine();
           
            System.out.print("Enter the marks of " + name + ": ");
            int marks = sc.nextInt();
            sc.nextLine();
           
            students[i] = new Student(name, marks);
        }
       
        int totalMarks = 0;
        for (Student student : students) {
            totalMarks += student.getMarks();
        }
       
        double averageMarks = (double) totalMarks / students.length;
       
        System.out.println("Average marks of the students: " + averageMarks);
       
        sc.close();
    }
}
