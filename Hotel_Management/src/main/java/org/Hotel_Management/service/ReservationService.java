package org.Hotel_Management.service;

import org.Hotel_Management.model.Reservation;
import org.Hotel_Management.model.Room;

import java.util.*;
import java.util.stream.Collectors;

public class ReservationService {

    private final List<Room> rooms;

    private final Map<String, List<Reservation>> bookingsByDate;

    private final Map<String, Double> revenueByRoomType;

    public ReservationService() {

        rooms = new ArrayList<>();

        bookingsByDate = new HashMap<>();

        revenueByRoomType = new HashMap<>();
    }

    // Load Rooms
    public void loadRooms(List<Room> inputRooms) {

        rooms.clear();

        rooms.addAll(inputRooms);
    }

    // Stream API Filtering
    public List<Room> findAvailableRooms(String type, double maxPrice) {

        return rooms.stream().filter(r -> r.isAvailable() && r.getType().equalsIgnoreCase(type) && r.getPricePerNight() <= maxPrice).collect(Collectors.toList());
    }

    // computeIfAbsent()
    public void addBooking(String date, Reservation reservation) {

        bookingsByDate.computeIfAbsent(date, k -> new ArrayList<>()).add(reservation);
    }

    // merge()
    public void trackRevenue(String roomType, double price) {

        revenueByRoomType.merge(roomType, price, Double::sum);
    }

    // removeIf()
    public void evictCancelledBookings() {

        bookingsByDate.values().forEach(list -> list.removeIf(reservation -> "Cancelled".equalsIgnoreCase(reservation.getStatus())));
    }

    // Stream Aggregation
    public double calculateTotalRevenue() {

        return revenueByRoomType.values().stream().mapToDouble(Double::doubleValue).sum();
    }

    // Optional Helper Methods

    public Map<String, List<Reservation>> getBookingsByDate() {
        return bookingsByDate;
    }

    public Map<String, Double> getRevenueByRoomType() {
        return revenueByRoomType;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
