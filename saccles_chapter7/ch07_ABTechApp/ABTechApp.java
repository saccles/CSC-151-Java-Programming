/*
 * Class: CSC-151 - Java Programming
 * Author: S. Benjamin Accles
 * Last Modified: 7 October 2024
 * Purpose: This application uses Abtech and Student classes to showcase 
 * principles of object-oriented programming.
 */

public class ABTechApp {

    public static void main(String[] args) {
        
        // Display tuition cost.
        System.out.println("Tuition cost:");
        System.out.println(Abtech.getTuitionCost(true, 18) + "\n");
        
        // Display school banner.
        System.out.println("School banner:");
        System.out.println(Abtech.getSchoolBanner());
        
        // Create a Student object named test.
        Student test = new Student("silas", "accles", 2024);
        
        // Display student information.
        System.out.println("Student information:");
        System.out.println(test.getStudent());
    }
}
