package org.Hotel_Management.threads;

import org.Hotel_Management.model.Reservation;

public class PaymentProcessor extends Thread {

    private final Reservation reservation;
    private final Object lock;

    public PaymentProcessor(Reservation reservation, Object lock) {

        this.reservation = reservation;
        this.lock = lock;
    }

    @Override
    public void run() {

        try {
            System.out.println("Payment Started : " + reservation.getReservationId());

            // TIMED_WAITING
            Thread.sleep(150);

            synchronized (lock) {
                System.out.println("Waiting For Approval...");

                // WAITING
                lock.wait();
            }

            reservation.setStatus("Paid");
            System.out.println("Payment Completed : " + reservation.getReservationId());

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();
            System.out.println("Payment Interrupted");
        }
    }
}
