package com.parkinglotsystem.main.parking;

import com.parkinglotsystem.main.entities.ParkingSpot;

import java.util.List;
import java.util.Optional;

public class DefaultParkingStrategy implements  ParkingSpotStrategy{

    @Override
    public Optional<ParkingSpot> findParkingSpot(List<ParkingSpot> parkings){
        return parkings.stream()
                .filter(parkingSpot -> parkingSpot.getType().equals(ParkingType.TWO_WHEELER) && parkingSpot.isEmpty())
                .findFirst();
    }
}
