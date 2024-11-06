import java.util.Random;
import java.util.Scanner;

class RandomNumberGenerator extends Thread {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Press Enter to generate a random number...");
            scanner.nextLine(); 
            int number = random.nextInt(100);
            System.out.println("Generated Number: " + number);

            if (number % 2 == 0) {
                int square = number * number;
                System.out.println("Square of " + number + " is: " + square);
            } else {
                int cube = number * number * number;
                System.out.println("Cube of " + number + " is: " + cube);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class exp71 {
    public static void main(String[] args) {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        rng.start();
    }
}

