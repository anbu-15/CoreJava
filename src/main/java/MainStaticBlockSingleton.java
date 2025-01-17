//public class MainStaticBlockSingleton {
//}
class StaticBlockSingleton {
    private static final StaticBlockSingleton INSTANCE;

    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Error creating singleton instance", e);
        }
    }

    private StaticBlockSingleton() {}

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
}
public class MainStaticBlockSingleton {
    public static void main(String[] args) {
        // First call to getInstance() retrieves the pre-created instance
        StaticBlockSingleton singleton1 = StaticBlockSingleton.getInstance();
        System.out.println("Singleton 1: " + singleton1);

        // Subsequent calls return the same instance
        StaticBlockSingleton singleton2 = StaticBlockSingleton.getInstance();
        System.out.println("Singleton 2: " + singleton2);

        // Verify that both references are the same
        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same!");
        }
    }
}