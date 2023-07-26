package org.example.storage.model.parkingTicket;

import org.example.storage.model.payment.Payment;

import java.time.LocalDateTime;

public class ParkingTicket {
    int ticketNo;
    LocalDateTime timeStamp;
    LocalDateTime exit;
    double ammount;
    Payment payment;

}
