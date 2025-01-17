import java.util.ArrayList;
import java.util.PriorityQueue;

 public class QueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        ArrayList<Integer> integers=new ArrayList<>();
        queue.add(10);
        integers.add(10);
        queue.add(5);
        integers.add(5);
        queue.add(20);
        integers.add(20);


        System.out.println("Queue: " + queue);
        System.out.println("integer: " + integers);
        // Removing elements
        while (!queue.isEmpty()) {
            System.out.println("Removed: " + queue.poll());
        }
    }
}