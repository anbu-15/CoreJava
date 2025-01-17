import java.util.concurrent.ConcurrentHashMap;

public class SegmentLockExample {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Thread 1: Modify the key in segment 0 (e.g., "apple")
        Thread thread1 = new Thread(() -> {
            map.put("apple", 1);  // This might be in segment 0
            System.out.println("Thread 1: Added 'apple' in segment 0");
        });

        // Thread 2: Modify the key in segment 3 (e.g., "banana")
        Thread thread2 = new Thread(() -> {
            map.put("banana", 2);  // This might be in segment 3
            System.out.println("Thread 2: Added 'banana' in segment 3");
        });

        Thread thread3 = new Thread(() -> {
            map.put("cherry", 3);  // This might be in segment 2
            System.out.println("Thread 3: Added 'cherry' in segment 2");
        });

        // Start both threads
        thread1.start();
        thread2.start();
        thread3.start();


        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final map
        System.out.println("Final map: " + map);
    }
}
