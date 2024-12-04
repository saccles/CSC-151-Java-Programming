/*
 * Class: CSC-151 - Java Programming
 * Contributor: S. Benjamin Accles
 * Last Modified: 16 October 2024
 * Purpose: This application uses the Console class and arrays to display
 * the sales for a given month.
 */

import java.text.NumberFormat;

public class MonthSalesApp {

    public static void main(String[] args) {
        System.out.println("Monthly Sales\n");
        
        // Create the monthNames and sortedMonthlySales arrays.
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        double[] sortedMonthlySales = {
            2287.66, 2697.45, 2349.88, 2814.57, 1287.45, 2458.79, 
            2799.41, 1784.59, 3174.73, 2788.09, 2970.77, 3279.62
        };
        
        // Get currency formatting.
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // Get one or more months.
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
                       
            // Get and validate the month entered by the user.            
            int monthIndex = Console.getMonthAndSort(monthNames);
            
            // Get the month from monthNames.
            String month = monthNames[monthIndex];
            
            // Determine the sales for the given month.
            double sales = sortedMonthlySales[monthIndex];
            
            // Display the sales for the given month (currency-formatted).
            System.out.println("Sales for " 
                    + month
                    + ": " 
                    + currency.format(sales)
            );
            Console.displayLine();
            
            // Check if the user wants to continue.
            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }
        
        // Calculate the total sales for the year.
        double totalSales = 0;
        for (double sales: sortedMonthlySales) {
            totalSales += sales;
        }

        // Display the total sales for the year (currency-formatted).
        System.out.println("Total sales: " + currency.format(totalSales));
        Console.displayLine();
    }    
}
