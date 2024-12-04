/*
 * Class: CSC-151 - Java Programming
 * Contributor: S. Benjamin Accles
 * Last Modified: 18 September 2024
 * Purpose: This application calculates the future value of an investment
 * (updated to include static methods and data validation).
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class FutureValueApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Future Value Calculator\n");

        Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            
            // Get the input from the user.
            System.out.println("DATA ENTRY");
            double monthlyInvestment = getDouble(sc,
                    "Enter monthly investment: ", 0, 1000);
            double interestRate = getDouble(sc,
                    "Enter yearly interest rate: ", 0, 30);
            int years = getInt(sc,
                    "Enter number of years: ", 0, 100);
            System.out.println();

            // Calculate the future value.
            double futureValue = calculateFutureValue(
                    monthlyInvestment, interestRate, years);
            
            // Display formatted results to the user. 
            printFormattedResults(monthlyInvestment, interestRate, years, 
                    futureValue);
            
            // See if the user wants to continue.
            choice = askToContinue(sc);
        }
    }
    
    private static double getDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error! Invalid decimal value.");
            }
        }
    }

    public static double getDouble(Scanner sc, String prompt,
            double min, double max) {
        while (true) {
            double value = getDouble(sc, prompt);
            if (value > min && value < max) {
                return value;
            } else {
                System.out.println("Error! Number must be greater than " + 
                        min + " and less than " + max + ".");
            }
        }
    }
    
    private static int getInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error! Invalid integer value.");
            }
        }
    }
    
    private static int getInt(Scanner sc, String prompt,
            int min, int max) {
        while (true) {
            int value = getInt(sc, prompt);
            if (value > min && value < max) {
                return value;
            } else {
                System.out.println("Error! Number must be greater than " + 
                        min + " and less than " + max + ".");
            }
        }
    }

    public static double calculateFutureValue(double monthlyInvestment,
            double interestRate, int years) {
        
        // Convert yearly values to monthly values.
        double monthlyInterestRate = interestRate/12/100;
        int months = years * 12;
            
        double futureValue = 0.0;
        for (int i = 1; i <= months; i++) {
            futureValue = (futureValue + monthlyInvestment) *
                          (1 + monthlyInterestRate);
        }
        return futureValue;
    }
    
    public static void printFormattedResults(double monthlyInvestment,
            double interestRate, int years, double futureValue) {
        
        // Get the currency and percent formatters.
        NumberFormat c = NumberFormat.getCurrencyInstance();
        NumberFormat p = NumberFormat.getPercentInstance();
        p.setMinimumFractionDigits(1);

        // Display the results.
        System.out.println("FORMATTED RESULTS\n"
              + "Monthly investment:   " + c.format(monthlyInvestment) + "\n"
              + "Yearly interest rate: " + p.format(interestRate / 100) + "\n"
              + "Number of years:      " + years + "\n"
              + "Future value:         " + c.format(futureValue) + "\n");
    }
    
    public static String askToContinue(Scanner sc) {
        
        // See if the user wants to continue.
        System.out.print("Continue? (y/n): ");
        String choice = sc.nextLine();
        System.out.println();
        
        return choice;
    }
}