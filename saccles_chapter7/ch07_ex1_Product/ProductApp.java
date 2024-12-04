/*
 * Class: CSC-151 - Java Programming
 * Contributor: S. Benjamin Accles
 * Last Modified: 7 October 2024
 * Purpose: This application returns a product from the database given
 * its product code.
 */

import java.util.Scanner;

public class ProductApp {

    public static void main(String args[]) {
        
        // Display a welcome message.
        System.out.println("Welcome to the Product Viewer");
        System.out.println();

        // Display 1 or more products.
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            
            // Get the input from the user.
            System.out.print("Enter product code: ");
            String productCode = sc.nextLine();  // Read the product code.

            // Create the ProductDB and Product objects.
            ProductDB db = new ProductDB();
            Product product = db.getProduct(productCode);

            // Display the output.
            System.out.println();
            System.out.println("SELECTED PRODUCT");
            System.out.println("Description: " + product.getDescription());
            System.out.println("Price:       " + product.getPriceNumberFormat());
            System.out.println();

            // See if the user wants to continue.
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
    }
}