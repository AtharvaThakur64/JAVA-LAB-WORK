//Q.1) WAP to implement Linear search.
package com.array;

import java.util.Scanner;

public class linearsearch {

    public static void main(String[] args) {
        // Variable declarations
        int i, len, key, array[];

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the length of the array
        System.out.println("ENTER ARRAY LENGTH:");
        len = input.nextInt();

        // Initialize the array with the given length
        array = new int[len];

        // Prompt user to enter the elements of the array
        System.out.println("ENTER " + len + " ELEMENTS:");
        for (i = 0; i < len; i++) {
            array[i] = input.nextInt();
        }

        // Prompt user to enter the search key value
        System.out.println("ENTER THE SEARCH KEY VALUE:");
        key = input.nextInt();

        // Perform linear search
        for (i = 0; i < len; i++) {
            if (array[i] == key) {
                // If key is found, print its location and exit the loop
                System.out.println(key + " is present at location " + (i + 1));
                break;
            }
        }

        // If the loop completes without finding the key, print that it doesn't exist
        if (i == len) {
            System.out.println(key + " doesn't exist in array.");
        }
    }
}
