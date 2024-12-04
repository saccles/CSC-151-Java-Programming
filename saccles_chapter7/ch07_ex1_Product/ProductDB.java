/*
 * Class: CSC-151 - Java Programming
 * Contributor: S. Benjamin Accles
 * Last Modified: 7 October 2024
 * Purpose: This class models a simple product database.
 */

public class ProductDB {

    public Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database.
        // For now, this code just uses if/else statements
        // to return the correct product data.

        // Declare the Product object.
        Product product;
        
        // Fill the Product object with data.
        if (productCode.equalsIgnoreCase("java")) {
            product = new Product(
                    productCode, "Murach's Java Programming", 57.50);
        } else if (productCode.equalsIgnoreCase("jsp")) {
            product = new Product(
                    productCode, "Murach's Java Servlets and JSP", 57.50);
        } else if (productCode.equalsIgnoreCase("mysql")) {
            product = new Product(productCode, "Murach's MySQL", 54.50);
        } else if (productCode.equalsIgnoreCase("python")) {
            product = new Product(
                    productCode, "Murach's Python Programming", 53.50);
        } else {
            product = new Product(productCode, "Unknown", 0);
        }
        
        return product;
    }
}
