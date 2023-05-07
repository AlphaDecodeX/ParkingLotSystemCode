package com.parkinglotsystem.main.parking;

import com.parkinglotsystem.main.entities.ParkingSpot;
import com.parkinglotsystem.main.entities.Ticket;
import com.parkinglotsystem.main.entities.Vehicle;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class ParkingSpotManager {
    private List<ParkingSpot> parkings;
    public Optional<ParkingSpot> findParkingSpot(ParkingSpotStrategy ps){
        return ps.findParkingSpot(parkings);
    }

    public boolean parkVehicle(Vehicle v, Ticket t, ParkingSpotStrategy ps){
        Optional<ParkingSpot> parkingSpot = findParkingSpot(ps);
        if(parkingSpot.isPresent()){
            parkingSpot.get().occupy();
            return true;
        }
        return false;
    }
}
