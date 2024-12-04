/*
 * Class: CSC-151 - Java Programming
 * Contributor: S. Benjamin Accles
 * Last Modified: 7 October 2024
 * Purpose: This class models a simple product.
 */

import java.text.NumberFormat;

public class Product {

    private String code;
    private String description;
    private double price;
    
    public Product() {
        code = "";
        description = "";
        price = 0;
    }
    
    public Product(String code, String description, double price) {
        this.code = code;
        this.description = code;
        this.price = price;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }
    
    public String getPriceNumberFormat() {
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMinimumFractionDigits(2);
        number.setMaximumFractionDigits(2);
        return number.format(price);
    }
}