/*
 * Class: CSC-151 - Java Programming
 * Contributor: S. Benjamin Accles
 * Last Modified: 18 September 2024
 * Purpose: This application calculates the future value of an investment
 * (updated to include static methods and data validation).
 */

import java.util.Scanner;

public class GuessNumberApp {
    
    private static void displayWelcome(int limit) {
        System.out.println("Guess the number!");
        System.out.println("I'm thinking of a number from 1 to " + limit);
        System.out.println();
    }
    
    public static int getRandomInt(int limit) {
        double d = Math.random() * limit;   // d is >= 0.0 and < limit.
        int i = (int) d;                    // Convert double to int.
        i++;                                // int is >= 1 and <= limit.
        return i;
    }

    public static void main(String[] args) {
        final int LIMIT = 100;
        
        displayWelcome(LIMIT);
        int number = getRandomInt(LIMIT);
        
        Scanner sc = new Scanner(System.in);            
        int count = 1;
        while (true) {
            
            int guess;
            try {
                System.out.print("Your guess: ");
                guess = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer. Try again.");
                continue;
            }
            
            if (guess < 1 || guess > LIMIT) {
                System.out.println("Invalid guess. Try again.");
                continue;
            }
            
            if (guess < number) {
                
                // Let the user know if their guess is within 10 digits of the
                // random number.
                if ( (number - guess) <= 10 ) {
                    System.out.println("Too low, but you are getting warm!");
                } else {
                    System.out.println("Too low.");
                }
            } else if (guess > number) {
                
                // Let the user know if their guess is within 10 digits of the
                // random number.
                if ( (guess - number) <= 10 ) {
                    System.out.println("Too high, but you are getting warm!");
                } else {
                    System.out.println("Too high.");
                }
            } else {
                System.out.println("You guessed it in " + 
                                   count + " tries.\n");
                break;
            }
            
            count++;            
        }
        
        System.out.println("Bye!");
    }   
}
