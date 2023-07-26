package org.example.storage.model.parkingSpot;

public class Handicapped extends ParkingSpot{
    @Override
    boolean isFree() {
        return false;
    }
}
