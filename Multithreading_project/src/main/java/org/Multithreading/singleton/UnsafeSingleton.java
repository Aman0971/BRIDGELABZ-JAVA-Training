package org.Multithreading.singleton;

public class UnsafeSingleton {

    private static UnsafeSingleton instance;

    private UnsafeSingleton() {
    }

    public static UnsafeSingleton getInstance() {

        if (instance == null) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            instance = new UnsafeSingleton();
        }

        return instance;
    }
}
