/*
 * Class: CSC-151 - Java Programming
 * Contributor: S. Benjamin Accles
 * Last Modified: 11 September 2024
 * Purpose: This application calculates the future value of an investment.
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class FutureValueApp {

    public static void main(String[] args) {
        
        // Welcome the user to the program.
        System.out.println("The Future Value Calculator\n");
        
        // Create a Scanner object named sc.
        Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        
        while (choice.equalsIgnoreCase("y")) {
            
            // Get the input from the user.
            System.out.print("Enter monthly investment:   ");
            double monthlyInvestment = Double.parseDouble(sc.nextLine());
            System.out.print("Enter yearly interest rate: ");
            double interestRate = Double.parseDouble(sc.nextLine());
            System.out.print("Enter number of years:      ");
            int years = Integer.parseInt(sc.nextLine());
            
            // Convert yearly values to monthly values.
            double monthlyInterestRate = interestRate / 12 / 100;
            int months = years * 12;
            
            // Use a for loop to calculate the future value.
            double futureValue = 0.0;
            for (int i = 1; i <= months; i++) {
                futureValue = (futureValue + monthlyInvestment) * 
                              (1 + monthlyInterestRate);
                
                // Display the current month and future value each time the 
                // loop runs.
                System.out.println("Month: " + i + "\n" +
                                   "Future value: " + futureValue);
            }

            // Print a blank line.
            System.out.println();
            
            // Format the result and display it to the user.
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            System.out.println("Future value:               "
                    + currency.format(futureValue));
            System.out.println();

            // See if the user wants to continue.
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
            
        }
        
        System.out.println("Bye!");
        
    }
    
}

