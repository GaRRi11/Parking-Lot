package org.example.storage.model.parkingSpot;

public abstract class ParkingSpot {
    int id;
    boolean isFree;

    abstract boolean isFree();
}
