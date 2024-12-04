/*
 * Class: CSC-151 - Java Programming
 * Contributer/Editor: S. Benjamin Accles
 * Last Modified: 28 August 2024
 * Purpose: 
 * This application processes user-inputted subtotals and displays the results 
 * to the user. 
 */

import java.util.Scanner;

public class InvoiceApp {

    public static void main(String[] args) {
        
        // Welcome the user to the program.
        System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println();  // Print a blank line.

        // Create a Scanner object named sc.
        Scanner sc = new Scanner(System.in);

        // Initialize variables for counting the total number of invoices, the 
        // total invoice amount, and the total discount amount.
        int invoiceCount = 0;
        double totalInvoiceAmount = 0.0;
        double totalDiscountAmount = 0.0;
        
        String choice = "";
        
        // Perform invoice calculations while choice isn't equal to "n" or "N".
        while ( !(choice.equalsIgnoreCase("n")) ) {
            
            // Get the invoice subtotal from the user.
            System.out.print("Enter subtotal:   ");
            String input = sc.nextLine();
            double subtotal = Double.parseDouble(input);

            double discountPercent;
            
            // Calculate the discount amount and total.
            if (subtotal >= 500) {
                discountPercent = .25;
            } else if (subtotal >= 200) {
                discountPercent = .2;
            } else if (subtotal >= 100) {
                discountPercent = .1;
            } else {
                discountPercent = 0.0;
            }
            double discountAmount = subtotal * discountPercent;
            double total = subtotal - discountAmount;

            // Display the discount amount and total.
            String message = "Discount percent: " + discountPercent + "\n"
                           + "Discount amount:  " + discountAmount + "\n"
                           + "Invoice total:    " + total + "\n";            
            System.out.println(message);

            // See if the user wants to continue.
            System.out.print("Continue? (n or N to quit, any other key to continue): ");
            choice = sc.nextLine();
            System.out.println();
            
            // Increment the invoice count by 1.
            invoiceCount += 1;
            
            // Increment the total invoice amount by the current total.  
            totalInvoiceAmount += total;
            
            // Increment the total discount amount by the current discount 
            // amount.
            totalDiscountAmount += discountAmount;
        }
        
        // Calculate the average invoice amount and average discount amount.
        double averageInvoiceAmount = totalInvoiceAmount / invoiceCount;
        double averageDiscountAmount = totalDiscountAmount / invoiceCount;
        
        // Display the number of invoices, average invoice amount, and 
        // average discount amounts to the user. 
        System.out.println("Number of invoices: " + invoiceCount);
        System.out.println("Average invoice: "    + averageInvoiceAmount);
        System.out.println("Average discount: "   + averageDiscountAmount);
    }
}