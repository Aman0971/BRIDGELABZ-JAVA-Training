package org.Multithreading.singleton;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class SingletonConcurrencyDemo {

    public static void runDemo() throws Exception {

        System.out.println("\n===== Unsafe Singleton =====");

        Set<Integer> unsafeHashCodes = ConcurrentHashMap.newKeySet();

        Thread[] unsafeThreads = new Thread[50];

        for (int i = 0; i < 50; i++) {

            unsafeThreads[i] = new Thread(() -> {

                UnsafeSingleton instance = UnsafeSingleton.getInstance();

                unsafeHashCodes.add(instance.hashCode());
            });

            unsafeThreads[i].start();
        }

        for (Thread t : unsafeThreads) {
            t.join();
        }

        System.out.println("Unique HashCodes: " + unsafeHashCodes.size());

        System.out.println(unsafeHashCodes);

        System.out.println("\n===== Safe Singleton =====");

        Set<Integer> safeHashCodes = ConcurrentHashMap.newKeySet();

        Thread[] safeThreads = new Thread[50];

        for (int i = 0; i < 50; i++) {

            safeThreads[i] = new Thread(() -> {

                SafeSingleton instance = SafeSingleton.getInstance();

                safeHashCodes.add(instance.hashCode());
            });

            safeThreads[i].start();
        }

        for (Thread t : safeThreads) {
            t.join();
        }

        System.out.println("Unique HashCodes: " + safeHashCodes.size());

        System.out.println(safeHashCodes);
    }
}