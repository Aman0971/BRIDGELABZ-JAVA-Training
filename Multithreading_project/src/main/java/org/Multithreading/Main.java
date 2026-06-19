package org.Multithreading;
import org.Multithreading.lifecycle.ThreadStateDemo;
import org.Multithreading.producerconsumer.ProducerConsumerDemo;
import org.Multithreading.singleton.SingletonConcurrencyDemo;


public class Main {

    public static void main(String[] args) {

        try {

            System.out.println(
                    "===== Thread Lifecycle Demo =====");

            ThreadStateDemo.demonstrateStates();

            ProducerConsumerDemo.runTraditionalDemo();

            ProducerConsumerDemo.runVirtualThreadDemo();

            SingletonConcurrencyDemo.runDemo();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
