package Multithreading;

class BankAccount {
    private double balance;
    private Object lock = new Object();

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        synchronized (lock) {
            System.out.println("Depositing: " + amount);
            balance += amount;
            System.out.println("New balance: " + balance);
        }
    }

    public void withdraw(double amount) {
        synchronized (lock) {
            if (balance >= amount) {
                System.out.println("Withdrawing: " + amount);
                balance -= amount;
                System.out.println("New balance: " + balance);
            } else {
                System.out.println("Insufficient balance!");
            }
        }
    }
}

public class BlockSync {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        // Creating multiple threads for concurrent access
        Thread depositThread = new Thread(() -> account.deposit(500));
        Thread withdrawThread = new Thread(() -> account.withdraw(200));

        // Starting the threads
        depositThread.start();
        withdrawThread.start();

        // Waiting for the threads to finish
        try {
            depositThread.join();
            withdrawThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Displaying the final balance
        System.out.println("Final balance: " + account.getBalance());
    }
}

