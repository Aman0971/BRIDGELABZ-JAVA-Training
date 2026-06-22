package org.Hotel_Management;
import java.io.File;

import org.Hotel_Management.io.CsvHandler;
import org.Hotel_Management.io.FileOperations;
import org.Hotel_Management.io.JsonHandler;
import org.Hotel_Management.model.Reservation;
import org.Hotel_Management.model.Room;
import org.Hotel_Management.service.ReservationService;
import org.Hotel_Management.threads.NotificationDispatcher;
import org.Hotel_Management.threads.ThreadStateTracker;
import org.Hotel_Management.threads.VirtualThreadSimulator;

import java.io.File;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        try {

            System.out.println("=================================");
            System.out.println(" HOTEL RESERVATION SYSTEM ");
            System.out.println("=================================");

            // =============================
            // FILE OPERATIONS
            // =============================

            System.out.println("\n1. File Operations");

            FileOperations.verifyDirectories("backup");

            File source =
                    new File("src/main/resources/rooms.csv");

            File destination =
                    new File("backup/rooms_backup.csv");

            FileOperations.backupCatalog(
                    source,
                    destination);

            System.out.println(
                    "Backup Created Successfully");

            // =============================
            // CSV HANDLING
            // =============================

            System.out.println(
                    "\n2. Reading Room CSV");

            List<Room> rooms =
                    CsvHandler.readRoomsFromCsv(
                            "src/main/resources/rooms.csv");

            rooms.forEach(System.out::println);

            // =============================
            // JSON VALIDATION
            // =============================

            System.out.println(
                    "\n3. JSON Schema Validation");

            boolean valid =
                    JsonHandler.validateJsonSchema(
                            "src/main/resources/booking.json",
                            "src/main/resources/booking-schema.json");

            if (!valid) {

                System.out.println(
                        "JSON Validation Failed");

                return;
            }

            // =============================
            // JSON READING
            // =============================

            System.out.println(
                    "\n4. Reading Reservations");

            List<Reservation> reservations =
                    JsonHandler.readReservationsFromJson(
                            "src/main/resources/booking.json");

            reservations.forEach(System.out::println);

            // =============================
            // SERVICE LAYER
            // =============================

            System.out.println(
                    "\n5. Reservation Service");

            ReservationService service =
                    new ReservationService();

            service.loadRooms(rooms);

            System.out.println(
                    "\nAvailable Single Rooms <= 150");

            List<Room> availableRooms =
                    service.findAvailableRooms(
                            "Single",
                            150);

            availableRooms.forEach(
                    System.out::println);

            // Add Booking

            for (Reservation reservation : reservations) {

                service.addBooking(
                        "2026-06-19",
                        reservation);

                service.trackRevenue(
                        "Room",
                        reservation.getTotalAmount());
            }

            System.out.println("Total Revenue : " + service.calculateTotalRevenue());

            // =============================
            // REMOVE CANCELLED BOOKINGS
            // =============================

            reservations.get(0)
                    .setStatus("Cancelled");

            service.evictCancelledBookings();

            System.out.println("Cancelled Bookings Removed");

            // =============================
            // THREAD LIFE CYCLE
            // =============================

            System.out.println("6. Thread Lifecycle");

            ThreadStateTracker
                    .demonstrateLifecycle();

            // =============================
            // RUNNABLE
            // =============================

            System.out.println("7. Notification Dispatcher");

            Thread notificationThread =
                    new Thread(
                            new NotificationDispatcher(
                                    reservations.get(1)));

            notificationThread.start();

            notificationThread.join();

            System.out.println(
                    "Current Status : "
                            + reservations.get(1)
                            .getStatus());

            // =============================
            // VIRTUAL THREADS
            // =============================

            System.out.println("8. Virtual Thread Simulation");

            FileOperations.verifyDirectories("receipts");

            VirtualThreadSimulator
                    .runHighConcurrencyTest(
                            service,
                            reservations);

            // =============================
            // JSON WRITING
            // =============================

            System.out.println("9. Writing JSON Output");

            JsonHandler.writeReservationsToJson("src/main/resources/output-booking.json", reservations);

            System.out.println("Project Completed Successfully");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
