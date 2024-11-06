import java.util.Scanner;

abstract class Theatre {
    public int availableTickets = 100;  
    public int soldTickets = 0;         
    public abstract void booking(int numberOfTickets);
    public abstract void cancellation(int numberOfTickets);
    public abstract int total_collection();
}

class NewRelease extends Theatre {
    public String filmName;  
    public final int ticketPrice = 150;

    public NewRelease(String filmName) {
        this.filmName = filmName;
    }

    public void booking(int numberOfTickets) {
        if (availableTickets >= numberOfTickets) {
            availableTickets -= numberOfTickets;
            soldTickets += numberOfTickets;
            System.out.println(numberOfTickets + " tickets booked successfully for " + filmName);
        } else {
            System.out.println("Not enough tickets available for " + filmName);
        }
    }

    public void cancellation(int numberOfTickets) {
        if (soldTickets >= numberOfTickets) {
            availableTickets += numberOfTickets;
            soldTickets -= numberOfTickets;
            System.out.println(numberOfTickets + " tickets cancelled for " + filmName);
        } else {
            System.out.println("Cancellation failed. Not enough tickets sold.");
        }
    }

    public int total_collection() {
        return soldTickets * ticketPrice;
    }
}

public class exp4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the name of the film: ");
        String filmName = scanner.nextLine();

        NewRelease movie = new NewRelease(filmName);  

        int choice;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Book Tickets");
            System.out.println("2. Cancel Tickets");
            System.out.println("3. View Total Collection");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of tickets to book: ");
                    int bookTickets = scanner.nextInt();
                    movie.booking(bookTickets);
                    break;

                case 2:
                    System.out.print("Enter number of tickets to cancel: ");
                    int cancelTickets = scanner.nextInt();
                    movie.cancellation(cancelTickets);
                    break;

                case 3:
                    System.out.println("Total collection for " + movie.filmName + ": Rs. " + movie.total_collection());
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}
