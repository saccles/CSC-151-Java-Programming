/*
 * Class: CSC-151 - Java Programming
 * Contributor: S. Benjamin Accles
 * Last Modified: 21 October 2024
 * Purpose: This class contains methods and other statements for "retrieving"
 * and returning products (represented by Product, Book, Album, Software, 
 * and Mp3 objects).
 */

public class ProductDB {

    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Product p = null;

        if (productCode.equalsIgnoreCase("java")
                || productCode.equalsIgnoreCase("jsp")
                || productCode.equalsIgnoreCase("mysql")) {
            Book b = new Book();
            if (productCode.equalsIgnoreCase("java")) {
                b.setCode(productCode);
                b.setDescription("Murach's Java Programming");
                b.setPrice(57.50);
                b.setAuthor("Joel Murach");
            } else if (productCode.equalsIgnoreCase("jsp")) {
                b.setCode(productCode);
                b.setDescription("Murach's Java Servlets and JSP");
                b.setPrice(57.50);
                b.setAuthor("Mike Urban");
            } else if (productCode.equalsIgnoreCase("mysql")) {
                b.setCode(productCode);
                b.setDescription("Murach's MySQL");
                b.setPrice(54.50);
                b.setAuthor("Joel Murach");
            }
            p = b; // set Product object equal to the Book object
        } else if (productCode.equalsIgnoreCase("netbeans")) {
            Software s = new Software();
            s.setCode("netbeans");
            s.setDescription("NetBeans");
            s.setPrice(0.00);
            s.setVersion("8.2");
            p = s; // set Product object equal to the Software object
        } else if (productCode.equalsIgnoreCase("sgtp")) {
            Album a = new Album();
            a.setCode(productCode);
            a.setDescription("Sgt. Peppers");
            a.setPrice(14.99);
            a.setArtist("The Beatles");
            p = a; // set Product object equal to the Album object
        } else if (productCode.equalsIgnoreCase("mpman") 
                || productCode.equalsIgnoreCase("ipod")) {
            Mp3 m = new Mp3();
            if (productCode.equalsIgnoreCase("mpman")) {
                m.setDescription("MPMan F10");
                m.setPrice(225.00);
            } else if (productCode.equalsIgnoreCase("ipod")) {
                m.setDescription("Apple iPod");
                m.setPrice(350.00);
            }
            p = m; // set Product object equal to the Mp3 object
        }
        
        return p;
    }
}
