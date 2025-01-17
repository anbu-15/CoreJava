class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("EagerSingleton instance created!");
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
public class MainEagerSingleton {
    public static void main(String[] args) {
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        EagerSingleton singleton2 = EagerSingleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same!");
        }
    }
}