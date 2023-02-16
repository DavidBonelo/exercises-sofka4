package com.davidbonelo._3_sorting_algorithms;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to generate?\n-> ");
        int numbersToGenerate = scanner.nextInt();
        double[] randomNumbers = generateRandomDoubles(numbersToGenerate);
        System.out.println("Unsorted numbers:\n" + Arrays.toString((randomNumbers)));

        System.out.print("What algorithm do you want to use to sort the numbers? 1. BubbleSort | 2. QuickSort\n-> ");
        int choice = scanner.nextInt();

        final long startTime = System.nanoTime();

        switch (choice) {
            case 1 -> System.out.println("Bubble sorted numbers:\n" + Arrays.toString((bubbleSort(randomNumbers))));
            case 2 -> System.out.println("QuickSorted numbers:\n" + Arrays.toString((quickSort(randomNumbers))));
            default -> System.out.println("Unknown option");
        }

        final long endTime = System.nanoTime();
        System.out.println("Total execution time: " + (endTime - startTime) + "ns");
    }

    private static double[] generateRandomDoubles(int amount) {
        ArrayList<Double> arrayList = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            arrayList.add(BigDecimal.valueOf(Math.random() * 100).setScale(4, RoundingMode.HALF_UP).doubleValue());
        }
        return arrayList.stream().mapToDouble(i -> i).toArray();
    }

    // perform the bubble sort
    private static double[] bubbleSort(double[] array) {
        int size = array.length;

        // loop to access each array element
        for (int i = 0; i < (size - 1); i++) {

            // check if swapping occurs
            boolean swapped = false;

            // loop to compare adjacent elements
            for (int j = 0; j < (size - i - 1); j++) {

                // compare two array elements
                // change > to < to sort in descending order
                if (array[j] > array[j + 1]) {

                    // swapping occurs if elements
                    // are not in the intended order
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }
            // no swapping means the array is already sorted
            // so no need for further comparison
            if (!swapped) break;
        }
        return array;
    }

    public static double[] quickSort(double[] array) {
//        ArrayList<Double> arrayList = Arrays.stream(array).boxed().collect(Collectors.toCollection(ArrayList::new));
        sort(array, 0, array.length - 1);
        return array;
    }

    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    private static int partition(double[] arr, int low, int high) {
        double pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    private static void sort(double[] arr, int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
}
