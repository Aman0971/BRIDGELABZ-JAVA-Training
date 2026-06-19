package org.Hotel_Management.threads;

import org.Hotel_Management.io.FileOperations;
import org.Hotel_Management.model.Reservation;
import org.Hotel_Management.service.ReservationService;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreadSimulator {

    public static void runHighConcurrencyTest(ReservationService service, List<Reservation> requests) {

        long startTime = System.currentTimeMillis();

        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {

            for (Reservation reservation : requests) {

                executor.submit(() -> {

                    try {

                        // Simulate Booking Processing
                        service.addBooking("2026-06-19", reservation);

                        // Simulate Revenue Tracking
                        service.trackRevenue("Room", reservation.getTotalAmount());

                        // Simulate Blocking I/O
                        FileOperations.writeReceipt("receipts/" + reservation.getReservationId() + ".txt",

                                "Reservation ID : " + reservation.getReservationId() + "\nGuest : " + reservation.getGuestName() + "\nAmount : " + reservation.getTotalAmount());

                    } catch (Exception e) {

                        e.printStackTrace();
                    }
                });
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Total Requests : " + requests.size());

        System.out.println("Execution Time : " + (endTime - startTime) + " ms");
    }
}
