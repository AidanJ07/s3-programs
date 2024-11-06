import java.util.Scanner;

abstract class Compartment {
    protected int availableSeats;

    public Compartment(int seats) {
        this.availableSeats = seats;
    }

    public abstract void notice();

    public void bookTickets(int numberOfTickets) {
        if (numberOfTickets <= availableSeats) {
            availableSeats -= numberOfTickets;
            System.out.println(numberOfTickets + " tickets booked successfully.");
        } else {
            System.out.println("Not enough seats available.");
        }
    }
}

class FirstClass extends Compartment {

    public FirstClass(int seats) {
        super(seats);
    }

    public void notice() {
        System.out.println("First Class - Balance seats: " + availableSeats);
    }
}

class GeneralClass extends Compartment {

    public GeneralClass(int seats) {
        super(seats);
    }

    public void notice() {
        System.out.println("General Class - Balance seats: " + availableSeats);
    }
}

public class exp43{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FirstClass firstClass = new FirstClass(20);
        GeneralClass generalClass = new GeneralClass(50);

        firstClass.notice();
        generalClass.notice();

        System.out.print("\nEnter number of tickets to book in First Class: ");
        int firstClassTickets = scanner.nextInt();
        firstClass.bookTickets(firstClassTickets);

        System.out.print("Enter number of tickets to book in General Class: ");
        int generalClassTickets = scanner.nextInt();
        generalClass.bookTickets(generalClassTickets);

        System.out.println("\nAfter booking:");
        firstClass.notice();
        generalClass.notice();

        scanner.close();
    }
}
