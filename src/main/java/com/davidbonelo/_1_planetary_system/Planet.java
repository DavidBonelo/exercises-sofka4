package com.davidbonelo._1_planetary_system;

public class Planet extends CelestialBody {
    private PlanetType type;
    private boolean containsLife;


    public Planet(String id, String name, double mass, double density, double diameter, CelestialBody orbitsBody) {
        super(id, name, mass, density, diameter, orbitsBody);
    }
}

