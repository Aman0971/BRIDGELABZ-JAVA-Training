package org.Multithreading.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {

    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity;

    public Buffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int value) {

        try {
            while (queue.size() == capacity) {
                wait();
            }
            queue.add(value);

            System.out.println(Thread.currentThread().getName() + " Produced: " + value);

            notifyAll();

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    public synchronized int consume() {

        try {
            while (queue.isEmpty()) {
                wait();
            }
            int value = queue.poll();
            System.out.println(Thread.currentThread().getName() + " Consumed: " + value);
            notifyAll();

            return value;
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return -1;
    }
}
