package org.Multithreading.lifecycle;

public class ThreadStateDemo {

    public static void demonstrateStates() throws Exception {

        final Object lock = new Object();
        final Object secondaryLock = new Object();

        Thread t = new Thread(() -> {
            try {
                // TIMED_WAITING
                Thread.sleep(100);

                // WAITING
                synchronized (lock) {
                    lock.wait();
                }

                // BLOCKED (main thread holds this lock)
                synchronized (secondaryLock) {
                    System.out.println("Thread acquired secondaryLock");
                }

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // 1. NEW
        System.out.println("NEW: " + t.getState());

        // 2. RUNNABLE
        t.start();
        System.out.println("RUNNABLE: " + t.getState());

        // 3. TIMED_WAITING
        Thread.sleep(50);
        System.out.println("TIMED_WAITING: " + t.getState());

        // Wait until thread reaches WAITING state
        while (t.getState() != Thread.State.WAITING) {
            Thread.sleep(10);
        }

        // 4. WAITING
        System.out.println("WAITING: " + t.getState());

        synchronized (secondaryLock) {

            // 5. Notify waiting thread
            synchronized (lock) {
                lock.notify();
            }

            // Give thread time to attempt acquiring secondaryLock
            while (t.getState() != Thread.State.BLOCKED) {
                Thread.sleep(10);
            }

            // 6. BLOCKED
            System.out.println("BLOCKED: " + t.getState());
        }

        // 7. TERMINATED
        t.join();
        System.out.println("TERMINATED: " + t.getState());
    }
}
