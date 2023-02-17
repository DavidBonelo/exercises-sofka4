package com.davidbonelo._1_planetary_system;

/**
 * Base class for celestial bodies.
 */
abstract public class CelestialBody {
    private String id;
    private String name;
    /**
     * mass given in kg.
     */
    private double mass;
    private double density; // kg/m^3
    /**
     * diameter given in km.
     */
    private double diameter;
    /**
     * the body this orbits.
     */
    private CelestialBody orbitsBody;

    public CelestialBody(String id, String name, double mass, double density, double diameter, CelestialBody orbitsBody) {
        this.id = id;
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.orbitsBody = orbitsBody;
    }

    public double getMass() {
        return mass;
    }
    public String getName() {
        return name;
    }

    /**
     * calculates the force of gravity between this and another object.
     * @param celestialBody the other object to calculate the gravity with.
     * @param distance the distance(in m) between this and the other object.
     * @return the value of the force of gravity between both objects.
     */
    public double calculateGravityBetween(CelestialBody celestialBody, double distance) {
        // F = G(m1m2)/R2 where G = 6.67430 N * m^2 * kg^−2  or  m^3 kg^−1 s^−2
        return 6.674 * Math.pow(10, -11) * this.mass * celestialBody.getMass() / (distance * distance);
    }
}
