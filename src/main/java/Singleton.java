public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // private constructor to prevent instantiation
        System.out.println("erfrtf");
    }

    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();

        }
        return instance;
    }
}
