package org.example.storage.model.displayBoard;

import org.example.storage.model.parkingSpot.Compact;
import org.example.storage.model.parkingSpot.Handicapped;
import org.example.storage.model.parkingSpot.Large;
import org.example.storage.model.parkingSpot.Motorcycle;

import java.util.ArrayList;
import java.util.List;

public class DisplayBoard {
    int id;
    List<Handicapped> handicappeds = new ArrayList<>();
    List<Compact> compacts = new ArrayList<>();
    List<Large> larges = new ArrayList<>();
    List<Motorcycle> motorcycles = new ArrayList<>();

    void showFreeSlot(){

    }

}
