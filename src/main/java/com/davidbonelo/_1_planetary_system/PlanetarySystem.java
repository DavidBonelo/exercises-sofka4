package com.davidbonelo._1_planetary_system;

public class PlanetarySystem {
    public static void main(String[] args) {
        // creation of instances of 2 celestial bodies
        Star sun = new Star("1", "Sun", 1.989 * Math.pow(10, 30), 1408, 1, null);
        Planet earth = new Planet("2", "Earth", 5.972 * Math.pow(10, 24), 5514, 1, sun);
        // calc the gravity between 2 celestial bodies
        double gravity = earth.calculateGravityBetween(sun, 1.497 * Math.pow(10, 11));

        System.out.println("the gravity between " + earth.getName() + " and " + sun.getName() + " is: " + gravity + " N");
    }
}
