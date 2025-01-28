import java.util.concurrent.CompletableFuture;

class OrderProcessingSystem {

    // Simulating fetching user profile (e.g., address, payment method)
    public static CompletableFuture<String> fetchUserProfile() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Fetching user profile...");
            try {
                Thread.sleep(2000); // Simulate delay in fetching user profile
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "User Profile: Address and Payment Method are valid";
        });
    }

    // Simulating payment processing
    public static CompletableFuture<String> processPayment(String userProfile) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Processing payment...");
            try {
                Thread.sleep(1500); // Simulate payment delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Payment processed successfully!";
        });
    }

    // Simulating shipment preparation after successful payment
    public static CompletableFuture<String> prepareShipment(String paymentStatus) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Preparing shipment...");
            try {
                Thread.sleep(1000); // Simulate shipment preparation delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Shipment prepared and dispatched!";
        });
    }

    // Main method to simulate the order processing flow
    public static void main(String[] args) {
        // Step 1: Fetch user profile asynchronously
        CompletableFuture<String> userProfileFuture = fetchUserProfile();

        // Step 2: Process payment based on user profile
        CompletableFuture<String> paymentFuture = userProfileFuture.thenCompose(userProfile -> processPayment(userProfile));

        // Step 3: Prepare shipment after payment is successful
        CompletableFuture<String> shipmentFuture = paymentFuture.thenCompose(paymentStatus -> prepareShipment(paymentStatus));

        // Step 4: Print final message once all tasks are done
        shipmentFuture.thenAccept(result -> {
            System.out.println("Order Processing Result: " + result);
        });

        // Wait for the final result
        shipmentFuture.join();
    }
}
