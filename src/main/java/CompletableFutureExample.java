import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            System.out.println("Task 1: Fetching data...");
            return "Data";
        }).thenApply(data -> {
            System.out.println("Task 2: Transforming " + data);
            return data.toUpperCase();
        }).thenAccept(result -> {
            System.out.println("Task 3: Result is " + result);
        }).exceptionally(ex -> {
            System.out.println("Error: " + ex.getMessage());
            return null;
        });
    }
}
