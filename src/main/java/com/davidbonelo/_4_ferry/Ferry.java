package com.davidbonelo._4_ferry;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Ferry {

    public static void main(String[] args) {

        System.out.println("Ferry manager!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert the amount of vehicles you want to register: (number)\n->");

        int vehiclesCapacity = scanner.nextInt();
        ArrayList<Vehicle> vehicles = new ArrayList<>(vehiclesCapacity);

        System.out.println("Insert " + vehiclesCapacity + " vehicles:");
        for (int i = 0; i < vehiclesCapacity; i++) {
            scanner.nextLine();
            System.out.println("\nVehicle #" + (i + 1) + ":");
            System.out.print("Select the type of vehicle you want to register:\n" +
                    "1. Generic | 2. Car | 3. Truck | 4. Bicycle | 5. Boat" + "\n->");

            int type = scanner.nextInt();
            switch (type) {
                case 1 -> vehicles.add(Vehicle.createVehicle());
                case 2 -> vehicles.add(VehicleFactory.createVehicle(VehicleType.CAR));
                case 3 -> vehicles.add(VehicleFactory.createVehicle(VehicleType.TRUCK));
                case 4 -> vehicles.add(VehicleFactory.createVehicle(VehicleType.BICYCLE));
                case 5 -> vehicles.add(VehicleFactory.createVehicle(VehicleType.BOAT));
                default -> System.out.println("Unknown vehicle type");
            }
        }
        System.out.println("\nList of vehicles in the ferry:");

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
