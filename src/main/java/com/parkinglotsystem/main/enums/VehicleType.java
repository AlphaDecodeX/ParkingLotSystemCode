package com.parkinglotsystem.main.enums;

public enum VehicleType {
    TWO_WHEELER("two_wheeler"),
    THREE_WHEELER("three_wheeler"),
    FOUR_WHEELER("four_wheeler");
    
    private final String value;
    
    private VehicleType(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
}