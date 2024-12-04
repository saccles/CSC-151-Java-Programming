/*
 * Class: CSC-151 - Java Programming
 * Author: S. Benjamin Accles
 * Last Modified: 5 September 2024
 * Purpose: This application uses the following formula to convert an inputted 
 * temperature in fahrenheit to the equivalent temperature in celsius.
 * Here is the formula: celsius = (fahrenheit - 32) * 5/9.
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class TemperatureConverterApp {

    public static void main(String[] args) {
    
        // Welcome the user to to the program.
        System.out.println("Welcome to the Temperature Converter");
        
        // Print a blank line for formatting purposes.
        System.out.println();
        
        // Create a Scanner object named sc.
        Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        
        while (choice.equalsIgnoreCase("y")) {
            
            // Get the temperature in fahrenheit from the user.
            System.out.print("Enter degrees in Fahrenheit: ");
            String input = sc.nextLine();
            double fahrenheit = Double.parseDouble(input);
            
            // Perform the fahrenheit to celsius temperature conversion.
            double celsius = (fahrenheit - 32) * 5/9;

            // Use the NumberFormat class to round the temperature in celsius 
            // to two decimal places.
            NumberFormat number = NumberFormat.getNumberInstance();
            number.setMaximumFractionDigits(2);
            String celsiusString = number.format(celsius);
            
            // Display results to the user.
            System.out.println("Degrees in Celsius: " + celsiusString);
            
            // Print a blank line for formatting purposes.
            System.out.println();
            
            // See if the user wants to continue.
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        
        }
    
    }

}

