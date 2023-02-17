package com.davidbonelo._4_ferry;

import java.time.LocalDate;

public class Truck extends Vehicle{

    private final int height;

    public Truck(int passengers, int wheels, boolean isCrewed, String travelMedium, LocalDate registrationDate, int height) {
        super(passengers, wheels, isCrewed, travelMedium, registrationDate);
        this.height = height;
    }
}
