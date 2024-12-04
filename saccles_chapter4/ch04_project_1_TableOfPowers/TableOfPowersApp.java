/*
 * Class: CSC-151 - Java Programming
 * Author: S. Benjamin Accles
 * Last Modified: 11 September 2024
 * Purpose: This application displays a table of squares and cubes from 1 to
 * the value entered by the user.
 */

import java.util.Scanner;

public class TableOfPowersApp { 

    public static void main(String[] args) {
        
        // Welcome the user to the program.
        System.out.println("Welcome to the Squares and Cubes table");
        
        // Print a blank line.
        System.out.println();
        
        // Create a Scanner object named sc.
        Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        
        while (choice.equalsIgnoreCase("y")) {
            
            // Get an integer number from the user.
            System.out.print("Enter an integer: ");
            int number = Integer.parseInt(sc.nextLine());
            
            // Print a blank line.
            System.out.println();

            // Display the table of powers up to and including the number 
            // inputted by the user.
            System.out.println(
                "Number  Squared Cubed \n======  ======= =====");
            for (int i = 1; i <= number; i++ ) {
                int numberSquared = i * i;
                int numberCubed = i * i * i;
                System.out.printf("%-7d %-7d %-7d %n", i, numberSquared, numberCubed);
            }
            
            // Print a blank line.
            System.out.println();
            
            // See if the user wants to continue.
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            
        }
        
    }
    
}
