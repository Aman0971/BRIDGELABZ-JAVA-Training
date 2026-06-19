package org.Hotel_Management.threads;

import org.Hotel_Management.model.Reservation;

public class NotificationDispatcher implements Runnable {

    private final Reservation reservation;

    public NotificationDispatcher(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public void run() {
        String mailLog = "Email Sent To : " + reservation.getGuestName() + " | Reservation Id : " + reservation.getReservationId();

        System.out.println(mailLog);
        reservation.setStatus("Confirmed");

        System.out.println("Reservation Confirmed");
    }
}
