//Q.2)Create ArrayList of your favourite vegetables and perform four operations on it.

package com.example;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylistdemo {

    public static void main(String[] args) {    // main class
        // TODO Auto-generated method stub
        
        // Defining ArrayList
        ArrayList<String> vegetables = new ArrayList<String>();
        
        // Adding elements to the ArrayList
        vegetables.add("Cucumber");
        vegetables.add("Pumpkin");
        vegetables.add("Tomato");
        vegetables.add("Peppers");
        vegetables.add("Eggplant");
        
        // Printing the elements in the ArrayList
        System.out.println("Favourite Vegetables list: " + vegetables);
        
        // Traversing list through iterator
        Iterator itr = vegetables.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        // Getting specified element from a specific position
        String str = vegetables.get(4);
        System.out.println("Most Favourite Vegetable: " + str);
        
        // Modifying the list at specified position
        vegetables.set(0, "Corn");
        System.out.println("Modified Favourite vegetable list: " + vegetables); 
    }
}
