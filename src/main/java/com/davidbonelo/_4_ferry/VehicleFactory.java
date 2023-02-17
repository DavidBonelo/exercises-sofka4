package com.davidbonelo._4_ferry;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class VehicleFactory {
    /**
     * Class that handles the creation of Vehicle child classes
     * @param type the type of vehicle enum.
     */
    public static Vehicle createVehicle(VehicleType type) {
//        Common fields of the Vehicle class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the amount of passengers the vehicle has: ");
        int passengers = scanner.nextInt();
        System.out.println("Insert the amount of wheels the vehicle has: ");
        int wheels = scanner.nextInt();
        scanner.nextLine(); // hacking the cursor
        System.out.println("Insert if the vehicle is crewed: (yes/no)");
        String userIsCrewed = scanner.nextLine();
        boolean isCrewed = Objects.equals(userIsCrewed, "yes");
        System.out.println("Insert the medium through which the vehicle travels:");
        String travelMedium = scanner.nextLine();
        System.out.println("Insert the date of registration of the vehicle: (YYYY-MM-DD)");
        LocalDate registrationDate = LocalDate.parse(scanner.nextLine());

//        particular fields of the Vehicle child classes and creation
        switch (type) {
            case CAR -> {
                short doors = Short.parseShort(read("Insert number of doors the car has (number): "));
                return new Car(passengers, wheels, isCrewed, travelMedium, registrationDate, doors);
            }
            case TRUCK -> {
                int height = Integer.parseInt(read("Insert the height of truck (number): "));
                return new Truck(passengers, wheels, isCrewed, travelMedium, registrationDate, height);
            }
            case BICYCLE -> {
                int wheelSize = Integer.parseInt(read("Insert the size of the wheels of the bicycle (number): "));
                return new Bicycle(passengers, wheels, isCrewed, travelMedium, registrationDate, wheelSize);
            }
            case BOAT -> {
                boolean powered = Objects.equals(read("Insert if the vehicle is crewed: (yes/no)"),"yes");
                return new Boat(passengers, wheels, isCrewed, travelMedium, registrationDate, powered);
            }
            default -> {
                return null;
            }
        }
    }

    /**
     * Simple method to show a prompt and read a string from std
     *
     * @param prompt a string to show in stdout
     * @return a String read from stdin
     */
    private static String read(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }
}

