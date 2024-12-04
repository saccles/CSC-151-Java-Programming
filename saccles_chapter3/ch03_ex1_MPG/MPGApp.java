/*
 * Class: CSC-151 - Java Programming
 * Contributor: S. Benjamin Accles
 * Last Modified: 5 September 2024
 * Purpose: This application calculates miles per gallons based on miles driven
 * and gallons of gas entered by the user.
 */

import java.util.Scanner;

// Import that corresponds to Math.round() method (currently not in use).
// import java.lang.Math; 

import java.text.NumberFormat;

public class MPGApp {

    public static void main(String[] args) {
        
        // Welcome the user to the program.
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();  // Print a blank line.

        // Create a scanner object named sc. 
        Scanner sc = new Scanner(System.in);
        
        String input;
        
        String choice = "y";
        
        while (choice.equalsIgnoreCase("y")) {
            
            // Get the miles driven from the user.
            System.out.print("Enter miles driven: ");
            input = sc.nextLine();
            double miles = Double.parseDouble(input);
            
            // Get the number of gallons of gas used from the user. 
            System.out.print("Enter gallons of gas used: ");
            input = sc.nextLine();
            double gallons = Double.parseDouble(input);
            
            // Calculate the miles per gallon by dividing the miles driven by 
            // the number of gallons used.
            double mpg = miles / gallons;
            
            // Use the Math class to round the miles per 
            // gallon to two decimal places (currently not in use).
            // mpg = (double) Math.round(mpg * 100) / 100;
            // System.out.println("Miles per gallon is " + mpg + ".");

            // Use the NumberFormat class to round the miles per gallon to 
            // two decimal places.
            NumberFormat number = NumberFormat.getNumberInstance();
            number.setMaximumFractionDigits(2);
            String mpgString = number.format(mpg);
            
            // Display miles per gallon calculation results to the user.
            System.out.println("Miles per gallon is " + mpgString + ".");
            System.out.println(); 
            
            // See if the user wants to continue.
            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        
        }
    
    }

}
