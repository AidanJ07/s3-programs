import java.util.Scanner;

abstract class Shape {
    public abstract void number_of_sides();
}

class Rectangle extends Shape {

    public void number_of_sides() {
        System.out.println("A rectangle has 4 sides.");
    }
}

class Triangle extends Shape {

    public void number_of_sides() {
        System.out.println("A triangle has 3 sides.");
    }
}

class Hexagon extends Shape {

    public void number_of_sides() {
        System.out.println("A hexagon has 6 sides.");
    }
}

public class exp42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to know the number of sides:");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Hexagon");

        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        Shape shape = null;
        switch (choice) {
            case 1:
                shape = new Rectangle();
                break;
            case 2:
                shape = new Triangle();
                break;
            case 3:
                shape = new Hexagon();
                break;
            default:
                System.out.println("Invalid choice! Please select 1, 2, or 3.");
        }

        if (shape != null) {
            shape.number_of_sides();
        }

        scanner.close();
    }
}
