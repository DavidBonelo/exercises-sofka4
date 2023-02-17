package com.davidbonelo._4_ferry;

import java.time.LocalDate;

public class Car extends Vehicle{
    private final short doors;

    public Car(int passengers, int wheels, boolean isCrewed, String travelMedium, LocalDate registrationDate, short doors) {
        super(passengers, wheels, isCrewed, travelMedium, registrationDate);
        this.doors = doors;
    }
}
