package com.davidbonelo._4_ferry;

import java.time.LocalDate;

public class Bicycle extends Vehicle {

    private final int wheelSize;

    public Bicycle(int passengers, int wheels, boolean isCrewed, String travelMedium, LocalDate registrationDate, int wheelSize) {
        super(passengers, wheels, isCrewed, travelMedium, registrationDate);
        this.wheelSize = wheelSize;
    }
}
