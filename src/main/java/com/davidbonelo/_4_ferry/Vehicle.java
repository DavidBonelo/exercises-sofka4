package com.davidbonelo._4_ferry;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class Vehicle {
    private final int passengers;
    private final int wheels;
    private final boolean isCrewed;
    private final String travelMedium;
    private final LocalDate registrationDate;

    public Vehicle(int passengers, int wheels, boolean isCrewed, String travelMedium, LocalDate registrationDate) {
        this.passengers = passengers;
        this.isCrewed = isCrewed;
        this.wheels = wheels;
        this.registrationDate = registrationDate;
        this.travelMedium = travelMedium;
    }

    public static Vehicle createVehicle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the amount of passengers the vehicle has: ");
        int passengers = scanner.nextInt();
        System.out.println("Insert the amount of wheels the vehicle has: ");
        int wheels = scanner.nextInt();
        scanner.nextLine();// hacking the cursor
        System.out.println("Insert if the vehicle is crewed: (yes/no)");
        String userIsCrewed = scanner.nextLine();
        boolean isCrewed = Objects.equals(userIsCrewed, "yes");
        System.out.println("Insert the medium through which the vehicle travels:");
        String travelMedium = scanner.nextLine();
        System.out.println("Insert the date of registration of the vehicle: (YYYY-MM-DD)");
        LocalDate registrationDate = LocalDate.parse(scanner.nextLine());

        return new Vehicle(passengers, wheels, isCrewed, travelMedium, registrationDate);
    }

    @Override
    public String toString() {
        return "passengers=" + passengers + ", wheels=" + wheels + ", isCrewed=" + isCrewed + ", " +
                "travelMedium='" + travelMedium + ", registrationDate=" + registrationDate;
    }
}
