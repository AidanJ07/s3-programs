import java.util.Scanner;

public class Box {
    double width;
    double height;
    double depth;

    public Box() {
        width = 0.0;
        height = 0.0;
        depth = 0.0;
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box(double side) {
        width = side;
        height = side;
        depth = side;
    }

    public void volume() {
        double volume = width * height * depth;
        System.out.println("Volume of the box: " + volume);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box box1 = new Box();
        System.out.println("Box 1");
        box1.volume();
   
        System.out.println("Enter width, height, and depth for Box 2:");
        double width2 = scanner.nextDouble();
        double height2 = scanner.nextDouble();
        double depth2 = scanner.nextDouble();
        Box box2 = new Box(width2, height2, depth2);
        System.out.println("Box 2 :");
        box2.volume();
       
        System.out.println("Enter a single value for all sides of Box 3:");
        double side = scanner.nextDouble();
        Box box3 = new Box(side);
        System.out.println("Box 3 :");
        box3.volume();
       
        scanner.close();
    }
}
