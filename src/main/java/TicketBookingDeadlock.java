class TicketBooking {
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

            System.out.println(Thread.currentThread().getName() + " waiting for payment to be processed...");
            synchronized (payment) {
                System.out.println(Thread.currentThread().getName() + " confirmed payment.");
            }
        }
    }

    // Method for Thread B: Lock the payment and then wait for the seat
    public void makePayment() {
        synchronized (payment) {
            System.out.println(Thread.currentThread().getName() + " locked " + payment);

            try {
                // Simulate time to make a payment
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " waiting for seat to be booked...");
            synchronized (seat) {
                System.out.println(Thread.currentThread().getName() + " confirmed seat booking.");
            }
        }
    }
}

public class TicketBookingDeadlock {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();

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
