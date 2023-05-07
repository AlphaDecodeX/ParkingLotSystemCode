package com.parkinglotsystem.main.entities;

import com.parkinglotsystem.main.enums.VehicleType;
import com.parkinglotsystem.main.parking.ParkingType;

public interface ParkingSpot {
    public boolean isEmpty();
    public void occupy();
    public void vacateParkingSpot();
    public ParkingType getType();

}
