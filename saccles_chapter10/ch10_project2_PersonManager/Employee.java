/*
 * Class: CSC-151 - Java Programming
 * Author: S. Benjamin Accles
 * Last Modified: 21 October 2024
 * Purpose: This class represents an Employee object and inherits the Person
 * class.
 */

public class Employee extends Person {
    private String ssn;
    
    public Employee(String first, String last, String ssn) {
        super(first, last);
        this.ssn = ssn;
    }
    
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    
    public String getSsn() {
        
        // Return the social security number in a way that shows only the last 
        // 4 digits and mask the rest of the ssn (uses regular expressions).
        // Example: 111-22-3333 -> xxx-xx-3333
        return (ssn.substring(0, 3).replaceAll(".", "x")
                + ssn.substring(3, 4)
                + ssn.substring(4, 6).replaceAll(".", "x")
                + ssn.substring(6, 11));
    }
    
    @Override
    public String toString() {
        return (super.toString() + "\n" + "SSN: " + getSsn());
    }
}
