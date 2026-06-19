package org.Multithreading.producerconsumer;

public class ProducerConsumerDemo {

    public static void runTraditionalDemo() throws Exception {

        System.out.println("\n===== Traditional Producer Consumer =====");

        Buffer buffer = new Buffer(5);

        Producer producer = new Producer(buffer);

        Thread consumer = new Thread(new Consumer(buffer));

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }

    public static void runVirtualThreadDemo() throws Exception {

        System.out.println("\n===== Virtual Thread Producer Consumer =====");

        Buffer buffer = new Buffer(5);

        Thread producer = Thread.ofVirtual().start(() -> {

            for (int i = 1; i <= 10; i++) {

                buffer.produce(i);

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread consumer = Thread.ofVirtual().start(() -> {

            for (int i = 1; i <= 10; i++) {

                buffer.consume();

                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        producer.join();
        consumer.join();
    }
}
