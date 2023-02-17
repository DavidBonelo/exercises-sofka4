package com.davidbonelo._4_ferry;

import java.time.LocalDate;

public class Boat extends Vehicle {

    private final boolean powered;

    public Boat(int passengers, int wheels, boolean isCrewed, String travelMedium, LocalDate registrationDate, boolean powered) {
        super(passengers, wheels, isCrewed, travelMedium, registrationDate);
        this.powered = powered;
    }
}
