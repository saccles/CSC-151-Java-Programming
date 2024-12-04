/*
 * Class: CSC-151 - Java Programming
 * Author: S. Benjamin Accles
 * Last Modified: 28 August 2024
 * Purpose: This application calculates the theoretical weight of a person on 
 * a given planet using the following formula:
   W (weight, newtons) = m (mass, kilograms) * g (gravitational acceleration, meters/second squared)
 */

import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        
        // Welcome the user to the program.
        System.out.println("Welcome to the Planet Weight Calculator!");
        
        // Create a Scanner object named sc.
        Scanner sc = new Scanner(System.in);
        
        String choice = "";
        
        while ( !(choice.equalsIgnoreCase("n")) ) {
            
            // Display available planets (to choose from) to the user.
            System.out.println("Supported planets: Earth, Mercury, Venus, Mars, Jupiter");
            
            // DIsplay available measurement systems (for entering the mass) to the user.
            System.out.println("Supported measurement systems: Metric, Imperial");
            
            // Print a blank line (for formatting purposes).
            System.out.println(); 
            
            // Get the planet choice from the user.
            System.out.print("Enter a planet from the list above: ");
            String planet = sc.nextLine();
            
            // Get the system of measurement from the user.
            System.out.print("Enter a measurement system from the list above: ");
            String measurementSystem = sc.nextLine();
            
            // Get the mass from the user.
            System.out.print("Enter your mass: ");
            String input = sc.nextLine();
            
            double mass = 0.0;
            
            // Based on the user's chosen measurement system, decide if the
            // inputted mass needs to be converted from pounds to kilograms.
            if (measurementSystem.equalsIgnoreCase("Metric")) {
                mass = Double.parseDouble(input);
            } else if (measurementSystem.equalsIgnoreCase("Imperial")) {
                mass = Double.parseDouble(input) / 2.205;
            }
            
            double acceleration = 0.0;
            
            // Determine the gravitational acceleration based on the chosen planet.
            if (planet.equalsIgnoreCase("Earth")) {
                acceleration = 9.8;
            } else if (planet.equalsIgnoreCase("Mercury")) {
                acceleration = 3.7;
            } else if (planet.equalsIgnoreCase("Venus")) {
                acceleration = 8.87;  
            } else if (planet.equalsIgnoreCase("Mars")) {
                acceleration = 3.72076;
            } else if (planet.equalsIgnoreCase("Jupiter")) {
                acceleration = 24.79;  
            }
            
            // Perform the calculation. (W = mg).
            double weight = mass * acceleration;
            
             // Print a blank line (for formatting purposes).
            System.out.println(); 
            
            // Display the results to the user.
            String message = "Mass:    " + mass   + " kilograms" + "\n"
                           + "Planet:  " + planet                + "\n"
                           + "Weight:  " + weight + " newtons"   + "\n";
            System.out.println(message);
            
            // See if the user wants to continue.
            System.out.print("Continue? (n or N to quit, any other key to continue): ");
            choice = sc.nextLine();
            System.out.println();
        }
    }
}
