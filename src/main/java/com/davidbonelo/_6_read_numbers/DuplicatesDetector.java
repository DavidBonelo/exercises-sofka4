package com.davidbonelo._6_read_numbers;

import java.util.Scanner;
import java.util.Vector;

/**
 * class that stores numbers and detects duplicates
 */
public class DuplicatesDetector {
    public static void main(String[] args) {
        // vector that stores the numbers
        Vector<Integer> numbers = new Vector<>();

        Scanner scanner = new Scanner(System.in);
        boolean foundDuplicate = false;
        while (!foundDuplicate) {
            System.out.print("Insert a number: ");
            int userNumber = scanner.nextInt();
            if (!numbers.contains(userNumber)) {
                numbers.add(userNumber);
                System.out.println(numbers.capacity());
            } else {
                foundDuplicate = true;
                System.out.println("You already inserted the number " + userNumber);
            }
        }
        // List the numbers stored.
        System.out.println("Stored numbers: ");
        for (int num : numbers) {
            System.out.print(num + ", ");
        }
    }
}

/*
- ArrayList is faster. Since it is non-synchronized, while vector operations give slower performance since they are synchronized
  (thread-safe), if one thread works on a vector, it has acquired a lock on it, which forces any other thread wanting
  to work on it to have to wait until the lock is released.
- If we don’t know how much data we will have but know the rate at which it grows, Vector has an advantage since we can set the increment value in vectors.
- Most of the time, programmers prefer ArrayList over Vector because ArrayList can be synchronized explicitly using Collections.synchronizedList.
- ArrayList is preferable when there is no specific requirement to use vector.
*/
