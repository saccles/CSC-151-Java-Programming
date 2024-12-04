/*
 * Class: CSC-151 - Java Programming
 * Author: S. Benjamin Accles
 * Last Modified: 7 October 2024
 * Purpose: This class models a grade object.
 */

public class Grade {
    private int number;
    private String letter;
    
    public Grade() {
        number = 0;
    }

    public Grade(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    
    public String getLetter() {
       if ( (number >= 88) && (number <= 100) ) {
           letter = "A";
       } else if ( (number >= 80) && (number <= 87) ) {
           letter = "B";
       } else if ( (number >= 67) && (number <= 79) ) {
           letter = "C";
       } else if ( (number >= 60) && (number <= 67) ) {
           letter = "D";
       } else if (number < 60) {
           letter = "F";
       }
       
       return letter;
    }
}
