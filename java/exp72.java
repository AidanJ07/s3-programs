import java.util.Random;
import java.util.Scanner;

class RandomNumberGenerator extends Thread {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Press Enter to generate a random number...");
            scanner.nextLine(); 
            int number = random.nextInt(100) + 2;
            System.out.println("Generated Number: " + number);

            if (number % 2 == 0) {
                System.out.print("Even numbers: ");
                for (int i = 2; i <= number; i += 2) {
                    System.out.print(i + " ");
                }
                System.out.println();
            } else {
                System.out.print("Odd numbers: ");
                for (int i = 1; i <= number; i += 2) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }

            try {
                Thread.sleep(1000);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class exp72 {
    public static void main(String[] args) {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        rng.start();  
    }
}
