import java.util.Scanner;

class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println("Current Balance: Rupees " + balance);
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited Rupees " + amount);
        displayBalance();
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew Rupees " + amount);
        } else {
            System.out.println("Insufficient balance to withdraw Rupees " + amount);
        }
        displayBalance();
    }
}

public class exp55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account(500.00);  
while(true){
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();

        Thread depositThread = new Thread(() -> account.deposit(depositAmount));
        Thread withdrawThread = new Thread(() -> account.withdraw(withdrawAmount));

        depositThread.start();
        withdrawThread.start();

        try {
            depositThread.join();
            withdrawThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        account.displayBalance();
    }}
}
