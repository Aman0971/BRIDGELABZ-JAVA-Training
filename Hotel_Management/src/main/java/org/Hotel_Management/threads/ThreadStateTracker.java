package org.Hotel_Management.threads;


import org.Hotel_Management.model.Reservation;

public class ThreadStateTracker {

    public static void demonstrateLifecycle() throws Exception {

        Object lock = new Object();

        Reservation reservation = new Reservation("RES-101", "Aman", 101, 2, 400.0, "Pending");

        PaymentProcessor t = new PaymentProcessor(reservation, lock);

        // NEW
        System.out.println("NEW : " + t.getState());

        t.start();

        // RUNNABLE -> sleep() me jayega
        System.out.println("After Start : " + t.getState());

        Thread.sleep(50);

        // TIMED_WAITING
        System.out.println("TIMED_WAITING : " + t.getState());

        Thread.sleep(150);

        synchronized (lock) {

            // WAITING
            System.out.println("WAITING : " + t.getState());

            lock.notify();

            // Lock abhi bhi main thread ke paas hai
            System.out.println("BLOCKED : " + t.getState());

            Thread.sleep(200);
        }

        t.join();

        // TERMINATED
        System.out.println("TERMINATED : " + t.getState());
    }
}
