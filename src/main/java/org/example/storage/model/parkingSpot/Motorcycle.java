package org.example.storage.model.parkingSpot;

public class Motorcycle extends ParkingSpot{
    @Override
    boolean isFree() {
        return false;
    }
}
