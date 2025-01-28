class A {
    synchronized void methodA(B b) {
        System.out.println("Thread 1: Holding lock A...");
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        b.last();  // Calling method in class B
    }
    synchronized void last() {
        System.out.println("Inside A's last method");
    }
}

class B {
    synchronized void methodB(A a) {
        System.out.println("Thread 2: Holding lock B...");
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        a.last();  // Calling method in class A
    }
    synchronized void last() {
        System.out.println("Inside B's last method");
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        final A a= new A();
        final B b= new B();
        // Thread 1
//        new Thread(() -> a.methodA(b)).start();
//
//        // Thread 2
//        new Thread(() -> b.methodB(a)).start();
        //
         //
         //
         //


        // Thread 1
        new Thread(() -> {
            synchronized (a) {
                    a.methodA(b);
            }
        }).start();

        // Thread 2
        new Thread(() -> {
            synchronized (b) {
                    b.methodB(a);
                }
        }).start();
    }
}