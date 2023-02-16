package com.davidbonelo._1_planetary_system;

public class Asteroid extends CelestialBody {
    private String materialComposition;
    private String Shape;


    public Asteroid(String id, String name, double mass, double density, double diameter, CelestialBody orbitsBody) {
        super(id, name, mass, density, diameter, orbitsBody);
    }
}
