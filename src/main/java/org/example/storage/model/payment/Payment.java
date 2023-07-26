package org.example.storage.model.payment;

import java.time.LocalDateTime;

public abstract class Payment {

    double ammount;
     PaymentStatus status;
    LocalDateTime timeStamp;

    abstract void calculate();

}
