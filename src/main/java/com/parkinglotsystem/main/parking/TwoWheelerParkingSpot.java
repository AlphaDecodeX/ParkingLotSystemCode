package com.parkinglotsystem.main.parking;

import com.parkinglotsystem.main.entities.ParkingSpot;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TwoWheelerParkingSpot implements ParkingSpot {
    private boolean isOccupied;
    private int noOfFloor;
    private int price;

    @Override
    public boolean isEmpty(){
        return !isOccupied;
    }

    @Override
    public void occupy(){
        this.isOccupied = true;
    }

    @Override
    public void vacateParkingSpot(){
       this.isOccupied = false;
    }

    @Override
    public ParkingType getType(){
        return ParkingType.TWO_WHEELER;
    }
}
