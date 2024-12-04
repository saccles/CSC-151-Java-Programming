/*
 * Class: CSC-151 - Java Programming
 * Author: S. Benjamin Accles
 * Last Modified: 21 October 2024
 * Purpose: This class represents a Customer object and inherits the Person
 * class.
 */

public class Customer extends Person {
    private String number;
    
    public Customer(String first, String last, String number) {
        super(first, last);
        this.number = number;
    }
    
    public void setCustomerNumber(String number) {
        this.number = number;
    }
    
    public String getCustomerNumber() {
        return number;
    }
    
    @Override
    public String toString() {
        return (super.toString() + "\n" + "Customer Number: " + number);
    }
}
