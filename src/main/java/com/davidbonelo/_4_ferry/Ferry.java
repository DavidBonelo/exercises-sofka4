package com.davidbonelo._4_ferry;

import java.util.ArrayList;

public class Ferry {

    public static void main(String[] args) {
        int vehiclesCapacity = 1;

        System.out.println("Ferry manager!");
        System.out.println("Insert " + vehiclesCapacity + " vehicles:");

        ArrayList<Vehicle> vehicles = new ArrayList<>(vehiclesCapacity);
        for (int i = 0; i < vehiclesCapacity; i++) {
            System.out.println("Vehicle #" + (i + 1)+ ":");
            vehicles.add(Vehicle.createVehicle());
        }
        System.out.println("\nList of vehicles in the ferry:");

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
