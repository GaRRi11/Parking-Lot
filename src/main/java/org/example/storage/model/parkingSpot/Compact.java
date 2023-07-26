package org.example.storage.model.parkingSpot;

public class Compact extends ParkingSpot{
    @Override
    boolean isFree() {
        return false;
    }
}
