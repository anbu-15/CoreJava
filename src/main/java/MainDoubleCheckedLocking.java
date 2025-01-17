class DoubleCheckedLockingSingleton {
    // The volatile keyword ensures visibility and prevents instruction reordering.
    private static volatile DoubleCheckedLockingSingleton instance;

    // Private constructor to prevent instantiation from outside
    private DoubleCheckedLockingSingleton() {
        System.out.println("DoubleCheckedLockingSingleton instance created!");
    }

    // Public method to provide access to the Singleton instance
    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) { // First check (without locking)
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) { // Second check (with locking)
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
public class MainDoubleCheckedLocking {
    public static void main(String[] args) {
        // First call to getInstance() creates the instance
        DoubleCheckedLockingSingleton singleton1 = DoubleCheckedLockingSingleton.getInstance();
        System.out.println("Singleton 1: " + singleton1);

        // Subsequent calls return the same instance
        DoubleCheckedLockingSingleton singleton2 = DoubleCheckedLockingSingleton.getInstance();
        System.out.println("Singleton 2: " + singleton2);

        // Check if both references are the same
        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same!");
        }
    }
}