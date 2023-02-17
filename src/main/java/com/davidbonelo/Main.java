package com.davidbonelo;

import com.davidbonelo._1_planetary_system.PlanetarySystem;
import com.davidbonelo._3_sorting_algorithms.Sorter;
import com.davidbonelo._4_ferry.Ferry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the number of the exercise to run: (1-6) ");
        int exercise = scanner.nextInt();
        switch (exercise) {
            case 1 -> PlanetarySystem.main(null);
            case 3 -> Sorter.main(null);
            case 4 -> Ferry.main(null);
        }
    }
}