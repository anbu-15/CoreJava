class Logger {
    public void log(String message) {
        System.out.println(Thread.currentThread().getName() + ": " + message);
    }
}

public class AsynchronousExample {
    public static void main(String[] args) {
        Logger logger = new Logger();

        // Multiple threads logging messages asynchronously
        Thread thread1 = new Thread(() -> logger.log("Message from Thread 1"));
        Thread thread2 = new Thread(() -> logger.log("Message from Thread 2"));
        Thread thread3 = new Thread(() -> logger.log("Message from Thread 3"));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

