class BankAccount {
    private int balance = 100;

    // Synchronized method to ensure thread-safe access
    public synchronized void withdraw(int amount, String threadName) {
        System.out.println(threadName + " is trying to withdraw " + amount);

        if (balance >= amount) {
            System.out.println(threadName + " withdrawal in progress...");
            try {
                Thread.sleep(1000); // Simulate time taken to withdraw
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println(threadName + " successfully withdrew " + amount + ". Remaining balance: " + balance);
        } else {
            System.out.println(threadName + " failed to withdraw due to insufficient balance. Balance: " + balance);
        }
    }
}

public class SynchronizedExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Multiple threads trying to withdraw money
        Thread user1 = new Thread(() -> account.withdraw(50, "User1"));
        Thread user2 = new Thread(() -> account.withdraw(70, "User2"));
        Thread user3 = new Thread(() -> account.withdraw(30, "User3"));

        user1.start();
        user2.start();
        user3.start();
    }
}
