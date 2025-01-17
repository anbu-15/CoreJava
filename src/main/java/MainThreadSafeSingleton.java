class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        System.out.println("ThreadSafeSingleton instance created!");
    }

    // Synchronized method to make it thread-safe
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
public class MainThreadSafeSingleton {
    public static void main(String[] args) {
        // First call to getInstance() creates the instance
        ThreadSafeSingleton singleton1 = ThreadSafeSingleton.getInstance();
        System.out.println("Singleton 1: " + singleton1);

        // Subsequent calls return the same instance
        ThreadSafeSingleton singleton2 = ThreadSafeSingleton.getInstance();
        System.out.println("Singleton 2: " + singleton2);

        // Check if both references are the same
        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same!");
        }
    }
}
