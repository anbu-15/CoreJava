import java.util.concurrent.*;

class Task implements Runnable {
    private final String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executing " + taskName);
        try {
            // Simulate task execution time
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(taskName + " completed by " + Thread.currentThread().getName());
    }
}

public class ThreadPoolExampleReal {
    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        ExecutorService threadPool = Executors.newFixedThreadPool(3);

        // Submit tasks to the thread pool
        for (int i = 1; i <= 5; i++) {
            threadPool.submit(new Task("Task " + i));
        }

        // Gracefully shut down the thread pool after completing all tasks
        threadPool.shutdown();
    }
}
