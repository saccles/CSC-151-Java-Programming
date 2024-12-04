/*
 * Class: CSC-151 - Java Programming
 * Contributor: S. Benjamin Accles
 * Last Modified: 7 October 2024
 * Purpose: This class contains methods for data collection and input 
 * validation.
 */

import java.util.Scanner;

public class Console {
    
    private static final Scanner sc = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();  
    }
    
    public static String getString(
            String prompt, String value1, String value2) {
        while (true) {
            System.out.print(prompt);
            String value = sc.nextLine();
            if ( (value.equals(value1)) || (value.equals(value2)) ) {
                return value;
            } else if (value.equals("")) {
                System.out.println(
                        "Error! This entry is required. Try again.");      
            } else {
                System.out.printf("Error! Entry must be '%s' or '%s'. "
                        + "Try again. \n", value1, value2); 
            }
        }
    }

    public static int getInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("Error! Invalid integer. Try again.");
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
                        + min + " and less than " + max + ". Try again.");
            } 
        }
    }

    public static double getDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(sc.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("Error! Invalid integer value. Try again.");
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
                        + min + " and less than " + max + ". Try again.");
            } 
        }
    }
}
