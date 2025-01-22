import java.util.concurrent.*;

public class CallableFuture {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            Thread.sleep(1000);
            return 42;
        };

        Future<Integer> future = executor.submit(task);

        System.out.println("Result: " + future.get()); // Get result from the future
        executor.shutdown();
    }
}
