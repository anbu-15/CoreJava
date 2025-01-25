class BillPughSingleton {
    // Private constructor to prevent instantiation
    private BillPughSingleton() {
        System.out.println("BillPughSingleton instance created!");
    }

    // Static inner class holding the Singleton instance
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    // Public method to access the Singleton instance
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
public class MainBillPughSingleton {

    public static void main(String[] args) {
        // First call to getInstance() triggers inner class loading and creates the instance
        BillPughSingleton singleton1 = BillPughSingleton.getInstance();
        System.out.println("Singleton 1: " + singleton1);

        // Subsequent calls return the same instance
        BillPughSingleton singleton2 = BillPughSingleton.getInstance();
        System.out.println("Singleton 2: " + singleton2);

        // Verify that both references are the same
        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same!");
        }
    }
}