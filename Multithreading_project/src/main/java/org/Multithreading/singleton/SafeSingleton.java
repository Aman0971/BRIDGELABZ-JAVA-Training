package org.Multithreading.singleton;

public class SafeSingleton {

    private static volatile SafeSingleton instance;

    private SafeSingleton() {
    }

    public static synchronized SafeSingleton getInstance() {

        if (instance == null) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            instance = new SafeSingleton();
        }

        return instance;
    }
}
