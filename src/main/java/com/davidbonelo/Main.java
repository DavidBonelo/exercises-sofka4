package com.davidbonelo;

import com.davidbonelo._1_planetary_system.PlanetarySystem;
import com.davidbonelo._2_entry_point.EntryPoint;
import com.davidbonelo._3_sorting_algorithms.Sorter;
import com.davidbonelo._4_ferry.Ferry;
import com.davidbonelo._6_read_numbers.DuplicatesDetector;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int exercise;

        try {
            exercise = Integer.parseInt(args[0]);
        } catch (Exception e) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select the number of the exercise to run: (1-6) ");
            exercise = scanner.nextInt();
        }
        switch (exercise) {
            case 1 -> PlanetarySystem.main(null);
            case 2 -> EntryPoint.main(null);
            case 3 -> Sorter.main(null);
            case 4, 5 -> Ferry.main(null);
            case 6 -> DuplicatesDetector.main(null);
        }
    }
}