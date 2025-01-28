import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<String> cartItems = new ArrayList<>();
    private double totalPrice = 0;

    public void addItem(String item, double price) {
        cartItems.add(item);
        totalPrice += price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void applyDiscount(double discount) {
        totalPrice -= discount;
    }

    public void displayCart() {
        System.out.println("Cart Items: " + cartItems);
        System.out.println("Total Price: $" + totalPrice);
    }
}

public class OnlineShoppingPlatform {

    public static void main(String[] args) {
        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Thread 1: Handles user interaction (browsing products and adding to cart)
        Thread userInteractionThread = new Thread(() -> {
            System.out.println("User is browsing products...");
            try {
                Thread.sleep(1000); // Simulate time taken to browse
                System.out.println("User searched for 'Smartphones'. Displaying results...");
                // Simulate user adding items to the cart
                cart.addItem("Smartphone A", 499.99);
                Thread.sleep(500); // Simulate time taken to add item
                cart.addItem("Smartphone B", 699.99);
                System.out.println("User added items to cart.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread 2: Processes background tasks (calculating discounts and cart summary)
        Thread backgroundProcessingThread = new Thread(() -> {
            try {
                Thread.sleep(2000); // Simulate time for processing cart
                System.out.println("Calculating discount...");
                double discount = 50.00;  // Example discount
                cart.applyDiscount(discount);
                System.out.println("Applied discount of $" + discount);

                // Update and display the cart summary
                cart.displayCart();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start both threads
        userInteractionThread.start();
        backgroundProcessingThread.start();
    }
}
