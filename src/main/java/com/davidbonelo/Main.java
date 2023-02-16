package com.davidbonelo;

import com.davidbonelo._1_planetary_system.PlanetarySystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the number of the exercise to run: (1-6) ");
        int exercise = scanner.nextInt();
        switch (exercise) {
            case 1 -> PlanetarySystem.main(null);
        }
    }
}