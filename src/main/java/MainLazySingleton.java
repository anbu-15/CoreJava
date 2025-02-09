//class LazySingleton extends Thread {
class LazySingleton {
//    public void run()
//    {
//        LazySingleton l=LazySingleton.getInstance();
//        System.out.println("threads running");
//    }
    private static LazySingleton instance; // Single instance of the class

    // Private constructor to prevent instantiation from outside
    private LazySingleton() {
        System.out.println("LazySingleton instance created!");
    }

    // Public method to provide access to the instance
    public static LazySingleton getInstance() {
        if (instance == null) { // Instance is created only when needed
            instance = new LazySingleton();
        }
        return instance;
    }
}
//To raise pr ...
public class MainLazySingleton {
    public static void main(String[] args) {
        // First call to getInstance() creates the instance

        LazySingleton singleton1 = LazySingleton.getInstance();
        System.out.println("Singleton 1: " + singleton1);




        // Subsequent calls return the same instance
        LazySingleton singleton2 = LazySingleton.getInstance();
        System.out.println("Singleton 2: " + singleton2);

        // First call to getInstance() creates the instance
//        LazySingleton singleton1 =new LazySingleton();

        // Subsequent calls return the same instance
//        LazySingleton singleton2 =new LazySingleton();
        //created threads above
//        singleton1.start();
//        singleton2.start();
//        try {
//            singleton1.join();
//            singleton2.join();
//        }catch (InterruptedException e) {
//            System.out.println("exception "+e.getMessage());
//        }

        // Check if both references point to the same object
        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same!");
        } else {
            System.out.println("Instances are different!");
}
}
}
