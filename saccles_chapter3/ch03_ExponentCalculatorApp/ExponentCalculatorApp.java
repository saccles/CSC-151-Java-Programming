/*
 * Class: CSC-151 - Java Programming
 * Author: S. Benjamin Accles
 * Last Modified: 5 September 2024
 * Purpose: This applications raises an inputted integer to an inputted power 
 * and diplays the results of the calculation to the user.
 */

import java.util.Scanner;
import java.lang.Math;

public class ExponentCalculatorApp {

    public static void main(String[] args) {
        
        // Welcome the user to the program.
        System.out.println("Welcome to the exponent calculator");
        
        // Print a blank line for formatting purposes.
        System.out.println();
        
        // Create a Scanner object named sc.
        Scanner sc = new Scanner(System.in);
        String input;
        
        String choice = "";
        
        while ( !(choice.equalsIgnoreCase("n")) ) {
            
            // Get an integer number to exponentiate from the user.
            System.out.print("Enter an integer: ");
            input = sc.nextLine();
            int base = Integer.parseInt(input);

            // Get an integer power (the power the base is being raised to) from
            // the user.
            System.out.print("Enter the power: ");
            input = sc.nextLine();
            int power = Integer.parseInt(input);

            // Raise the integer number to the specified power. 
            int result = (int) Math.pow(base, power);

            // Display results to the user.
            System.out.println(base + " to the power of " + power + " is: " + result);

            // See if the user wants to continue.
            System.out.print("Continue? (n or N to quit, any other key to continue): ");
            choice = sc.nextLine();
            System.out.println();   
        
        } 
    
    }

}
