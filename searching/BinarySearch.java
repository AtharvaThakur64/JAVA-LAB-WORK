//Q.1) WAP to implement Binary search.
package com.array;

import java.util.Scanner;

public class BinarySearch {
    // Declare an array of integers with a size of 5
    int a[] = new int[5];
    int i, j, temp, mid, low, high, key;
    Scanner sc = new Scanner(System.in);
    
    // Method to accept 5 elements from the user
    public void accept() {
        System.out.println("ENTER 5 ELEMENTS:");
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
    }
    
    // Method to sort the array in ascending order using a simple sorting algorithm
    public void sort() {
        for (i = 0; i < 5; i++) {
            for (j = i + 1; j < 5; j++) {
                if (a[i] > a[j]) {
                    // Swap elements if the current element is greater than the next element
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    
    // Method to display the sorted array
    public void display() {
        System.out.println("THE SORTED ELEMENTS ARE:");
        for (i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }

    // Method to perform binary search
    public void binarySearch() {
        // Prompt user to enter the search key value
        System.out.println("ENTER THE SEARCH KEY VALUE:");
        key = sc.nextInt();

        // Initialize low and high pointers
        low = 0;
        high = a.length - 1;

        // Perform binary search
        while (low <= high) {
            mid = (low + high) / 2;

            if (a[mid] == key) {
                // If key is found, print its location
                System.out.println("Key value found at position " + (mid + 1));
                return; // Exit the method if key is found
            } else if (key < a[mid]) {
                // If key is smaller than middle element, search in the left half
                high = mid - 1;
            } else {
                // If key is larger than middle element, search in the right half
                low = mid + 1;
            }
        }

        // If the key is not found in the array
        System.out.println("Element doesn't exist in the array.");
    }
    
    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch(); // Create an instance of BinarySearch
        obj.accept(); // Call accept method to input array elements
        obj.sort(); // Call sort method to sort the array
        obj.display(); // Call display method to show the sorted array
        obj.binarySearch(); // Call binarySearch method to perform binary search
    }
}
