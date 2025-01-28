class TicketBookingA {
    private final String seat = "Seat Resource";
    private final String payment = "Payment Resource";

    // Method for Thread A: Lock the seat and then wait for payment
    public void bookSeat() {
        synchronized (seat) {
            System.out.println(Thread.currentThread().getName() + " locked " + seat);

            try {
                // Simulate time to book a seat
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (payment) {
                System.out.println(Thread.currentThread().getName() + " confirmed payment.");
            }
        }
    }

    // Method for Thread B: Lock the seat first, then payment
    public void makePayment() {
        synchronized (seat) {
            System.out.println(Thread.currentThread().getName() + " locked " + seat);

            try {
                // Simulate time to make a payment
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (payment) {
                System.out.println(Thread.currentThread().getName() + " confirmed seat booking.");
            }
        }
    }
}

public class TicketBookingDeadlockAvoidance {
    public static void main(String[] args) {
        TicketBookingA booking = new TicketBookingA();

        // Thread A: Book seat, then make payment
        Thread threadA = new Thread(() -> {
            booking.bookSeat();
        }, "Thread A");

        // Thread B: Make payment, then book seat
        Thread threadB = new Thread(() -> {
            booking.makePayment();
        }, "Thread B");

        threadA.start();
        threadB.start();
    }
}
