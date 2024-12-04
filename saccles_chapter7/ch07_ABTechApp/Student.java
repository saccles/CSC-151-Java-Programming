/*
 * Class: CSC-151 - Java Programming
 * Author: S. Benjamin Accles
 * Last Modified: 7 October 2024
 * Purpose: This class models a student.
 */

public class Student {
    private String first_name;
    private String last_name;
    private int year;
    
    public Student() {
        first_name = "";
        last_name = "";
        year = 0;
    }
    
    // Constructor with arguments.
    public Student(String fname, String lname, int graduation_year) {
        this.first_name = fname;
        this.last_name = lname;
        this.year = graduation_year;
    }
    
    public String getStudent() {
        return first_name + " " + last_name + " " + year;
    }
}
