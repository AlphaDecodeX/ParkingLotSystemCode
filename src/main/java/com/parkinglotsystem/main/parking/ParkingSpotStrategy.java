package com.parkinglotsystem.main.parking;

import com.parkinglotsystem.main.entities.ParkingSpot;

import java.util.List;
import java.util.Optional;

public interface ParkingSpotStrategy {
    Optional<ParkingSpot> findParkingSpot(List<ParkingSpot> parkings);
}
