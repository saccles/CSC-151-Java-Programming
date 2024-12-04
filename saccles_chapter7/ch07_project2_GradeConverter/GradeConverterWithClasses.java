/*
 * Class: CSC-151 - Java Programming
 * Author: S. Benjamin Accles
 * Last Modified: 7 October 2024
 * Purpose: This application converts number grades to letter grades by using
 * a Grade class to store grades and a Console class to collect and validate 
 * input.
 */

public class GradeConverterWithClasses {
    
    public static void main(String[] args) {
        
        // Display a welcoming message.
        System.out.println("Welcome to the Letter Grade Converter \n");
        
        // Keep accepting and converting number grades to letter grades until
        // the user types "n."
        String choice = "y";
        while (choice.equals("y")) {
            String gradePrompt = "Enter numerical grade: ";
            
            // Create a Grade object named grade.
            Grade grade = new Grade();
            
            // Use the Console class to get the user's numerical grade and 
            // set the grade object's number attribute to the numerical grade.
            grade.setNumber(Console.getInt(gradePrompt, -1, 101));
            
            // Get the letter grade equivalent of the entered numerical grade.
            String letterGrade = grade.getLetter();
            
            // Display the letter grade.
            System.out.println("Letter grade: " + letterGrade);
            
            String continuePrompt = "Continue? (y/n): ";
            
            // Print a blank line.
            System.out.println();
            
            // See if the user wants to continue.
            choice = Console.getString(continuePrompt, "y", "n");
            
            // Print a blank line.
            System.out.println();
        }
    }
}
