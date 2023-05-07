package com.parkinglotsystem.main.entities;

import com.parkinglotsystem.main.enums.VehicleType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Ticket {
    int floorNo;
    int price;
    String name;
    long time;
    Vehicle vehicle;
    ParkingSpot parkingSpot;
}
