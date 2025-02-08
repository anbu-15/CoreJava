class Aa {
    synchronized void methodA(Bb b) {
        System.out.println("Thread 1: Holding lock A...");
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        b.last();  // Calling method in class B
    }

    synchronized void last() {
        System.out.println("Inside A's last method");
    }
}

class Bb {
    synchronized void methodB(Aa a) {
        System.out.println("Thread 2: Holding lock B...");
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        a.last();  // Calling method in class A
    }

    synchronized void last() {
        System.out.println("Inside B's last method");
    }
}

public class NoDeadlockExample {
    public static void main(String[] args) {
        final Aa a = new Aa();
        final Bb b = new Bb();

        // Thread 1: First locks A, then locks B
        new Thread(() -> {
            synchronized (a) {
                a.methodA(b);  // This will try to lock B
            }
        }).start();

        // Thread 2: First locks A, then locks B (same order as Thread 1)
        new Thread(() -> {
            synchronized (a) {
                b.methodB(a);  // This will try to lock A, which it already has
            }
        }).start();
    }
}