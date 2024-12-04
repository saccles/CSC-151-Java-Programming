/*
 * Class: CSC-151 - Java Programming
 * Contributor: S. Benjamin Accles
 * Last Modified: 16 October 2024
 * Purpose: This class contains methods for sorting, data collection and input 
 * validation.
 */

import java.util.Scanner;
import java.util.Arrays;

public class Console {
    
    private static final Scanner sc = new Scanner(System.in);
    
    public static void displayLine() {
        System.out.println();
    }

    public static void displayLine(String s) {
        System.out.println(s);
    }

    public static String getString(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();  
    }

    public static int getInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("Error! Invalid integer value.");
            }
        }
    }

    public static int getInt(String prompt, int min, int max) {
        while (true) {
            int value = getInt(prompt);
            if (value > min && value < max) {
                return value;
            } else {
                System.out.println("Error! Number must be greater than " 
                        + min + " and less than " + max + ".");
            } 
        }
    }

    public static double getDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(sc.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("Error! Invalid integer value.");
            }
        }
    }

    public static double getDouble(String prompt, double min, double max) {
        while (true) {
            double value = getDouble(prompt);
            if (value > min && value < max) {
                return value;
            } else {
                System.out.println("Error! Number must be greater than " 
                        + min + " and less than " + max + ".");
            } 
        }
    }
    
    public static int getMonthAndSort(String[] monthNames) {
        String monthPrompt = "Enter month name: ";
        
        // Sort monthNames in ascending order 
        // (required for binarySearch method to function).
        Arrays.sort(monthNames);
        
        while (true) {
            
            // Get the month from the user and capitalize the first letter
            // (while converting the rest of the string to lowercase).
            String month = getString(monthPrompt);
            month = month.substring(0, 1).toUpperCase() 
                    + month.substring(1).toLowerCase();
            
            // Search monthNames for the specified month.
            int monthIndex = Arrays.binarySearch(monthNames, month);
            
            // Check if the specified month is in monthNames.
            // If monthIndex is negative or monthIndex equals or exceeds the
            // length of monthNames, the month is invalid.
            if ( (monthIndex >= 0) && (monthIndex < monthNames.length) ) {
                return monthIndex;
            } else {
                System.out.println("Invalid month name. Try again.");
            } 
        }
    }
}