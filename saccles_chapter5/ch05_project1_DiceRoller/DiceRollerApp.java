/*
 * Class: CSC-151 - Java Programming
 * Author: S. Benjamin Accles
 * Last Modified: 18 September 2024
 * Purpose: This application simulates the rolling of a pair of six-sided dice.
 */

import java.util.Scanner;
import java.lang.Math;

public class DiceRollerApp {
    
    public static int rollDie() {
        
        // Generate a random number from 1 to 6 (represents a six-sided die).
        int die = (int) (Math.random() * 6) + 1;
        
        return die;
    }
    
    public static void displayResults(int die1, int die2, int total) {
                
        // Display the results of the dice roll.
        System.out.println(""
                + "Die 1: " + die1 + "\n" 
                + "Die 2: " + die2 + "\n"
                + "Total: " + total);
    }
    
    public static void displaySpecialMessage(int die1, int die2) {
                
        // If both dice roll a 1, display snake eyes special message.
        // Otherwise, if both dice roll a 6, display box cars special message.
        if ( (die1 == 1) && (die2 == 1) ) {
            System.out.println("Snake eyes!");
        } else if ( (die1 == 6) && (die2 == 6 ) ) {
            System.out.println("Box cars!");
        }
    }
    
    public static String askToContinue(Scanner sc) {
        
        // See if the user wants to continue.
        System.out.print("Roll again? (y/n): ");
        String choice = sc.nextLine();
        
        return choice;
    }
    
    public static void main(String[] args) {
        
        // Create a Scanner object named sc.
        Scanner sc = new Scanner(System.in);
        
        // Welcome the user to the program.
        System.out.println(("Dice Roller"));
        
        // Print a blank line.
        System.out.println();
        
        // Enter main program loop if user chooses "y" or "Y".
        System.out.print("Roll the dice? (y/n): ");
        String choice = sc.nextLine();
        while (choice.equalsIgnoreCase("y")) {
            
            // Print a blank line.
            System.out.println();
            
            // Roll the dice.
            int die1 = rollDie();
            int die2 = rollDie();
            
            int total = die1 + die2;
            
            // Display the results of the dice roll.
            displayResults(die1, die2, total);
            
            // Display a special message that applies to the current dice roll.
            // Special messages: snake eyes (2 ones), box cars (2 sixes)
            displaySpecialMessage(die1, die2);
                        
            // Print a blank line.
            System.out.println();
            
            // See if the user wants to continue.
            choice = askToContinue(sc);
        }
    }
}
