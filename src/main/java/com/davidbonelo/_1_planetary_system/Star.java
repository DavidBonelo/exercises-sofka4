package com.davidbonelo._1_planetary_system;

public class Star extends CelestialBody {
    private double estimatedLifeTime;
    private double energyIntensity;


    public Star(String id, String name, double mass, double density, double diameter, CelestialBody orbitsBody) {
        super(id, name, mass, density, diameter, orbitsBody);
    }
}
