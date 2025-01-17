import java.util.HashMap;

public class NonThreadSafeExample {
    private static final HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            map.put("apple", 1);
            System.out.println("Thread 1 added apple "+map.get("apple"));
        });

        Thread thread2 = new Thread(() -> {
            map.put("banana", 2);
            System.out.println("Thread 2 added banana "+map.get("banana"));
        });

        Thread thread3 = new Thread(() -> {
            map.put("cherry", 3);
            System.out.println("Thread 3 added cherry "+map.get("cherry"));
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
