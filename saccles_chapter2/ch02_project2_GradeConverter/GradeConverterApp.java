/*
 * Class: CSC-151 - Java Programming
 * Author: S. Benjamin Accles
 * Last Modified: 28 August 2024
 * Purpose: This application converts number grades to letter grades.
 */

import java.util.Scanner;

public class GradeConverterApp {

    public static void main(String[] args) {
        
        // Welcome the user to the program. 
        System.out.println("Welcome to the Letter Grade Converter");
        
        // Create a Scanner object named sc.
        Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        
        // Perform letter grade conversion while choice is equal to "y" or "Y". 
        while (choice.equalsIgnoreCase("y")) {
            
            // Print a blank line for formatting purposes. 
            System.out.println();
            
            // Get the numerical grade from the user.
            System.out.print("Enter numerical grade: ");
            String input = sc.nextLine();
            int grade = Integer.parseInt(input);
            
            String gradeMessage = "";
            
            // Convert the inputted grade to a letter grade.
            // Criteria: (A=88-100, B=80-87, C=67-79, D=60-67, F<60) 
            if (grade >= 88) {
                gradeMessage = "Letter grade: " + "A";
            } else if (grade >= 80) {
                gradeMessage = "Letter grade: " + "B";
            } else if (grade >= 67) {
                gradeMessage = "Letter grade: " + "C";
            } else if (grade >= 60) {
                gradeMessage = "Letter grade: " + "D";    
            } else if (grade < 60) {
                gradeMessage = "Letter grade: " + "F";
            }
            
            // Display the grade conversion results to the user.
            System.out.println(gradeMessage);
            
            // Print a blank line (to cleanly separate output).
            System.out.println();
            
            // See if the user wants to continue.
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
        }
    }
}
