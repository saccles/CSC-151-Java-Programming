/*
 * Class: CSC-151 - Java Programming
 * Contributor: S. Benjamin Accles
 * Last Modified: 11 September 2024
 * Purpose: This application a customer's invoice given a subtotal and customer type.
 */

import java.text.NumberFormat;
import java.util.Scanner;

public class InvoiceApp {

    public static void main(String[] args) {
        
        // Create a Scanner object named sc.
        Scanner sc = new Scanner(System.in);
        
        String choice = "y";

        while (!choice.equalsIgnoreCase("n")) {
            
            // Get the input from the user.
            System.out.print("Enter customer type (r/c/t/e): ");
            String customerType = sc.nextLine();
            
            System.out.print("Enter subtotal:   ");
            double subtotal = Double.parseDouble(sc.nextLine());
            
            // Get the discount percent.
            double discountPercent = 0.0;
            if (customerType.equalsIgnoreCase("r")) {
                if (subtotal >= 500) {
                    discountPercent = .3;
                } else if (subtotal >= 250 && subtotal < 500) {
                    discountPercent = .25;
                } else if (subtotal >= 100) {
                    discountPercent = .1;
                } else {  
                    discountPercent = 0.0;
                } 
            } else if (customerType.equalsIgnoreCase("c")) {
                discountPercent = .2;
            } else if (customerType.equalsIgnoreCase("t")) {
                if (subtotal >= 500) {
                    discountPercent = .5;
                } else if (subtotal < 500) {
                    discountPercent = .4;
                } 
            } else if (customerType.equalsIgnoreCase("e")) {
                if (subtotal > 500) {
                    discountPercent = .8;
                } else if (subtotal < 500) {
                    discountPercent = .6;
                }        
            }
            
            // Calculate the discount amount and round to 2 decimals.
            double discountAmount = subtotal * discountPercent;
            discountAmount = Math.ceil(discountAmount * 100) / 100;

            // Calculate the total.
            double total = subtotal - discountAmount;

            // Format and display the results.
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();
            System.out.println(
                "Discount percent: " + percent.format(discountPercent) + "\n"
              + "Discount amount:  " + currency.format(discountAmount) + "\n"
              + "Total:            " + currency.format(total) + "\n");

            // See if the user wants to continue.
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
            
        }
        
    }
    
}