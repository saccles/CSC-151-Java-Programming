/*
 * Class: CSC-151 - Java Programming
 * Contributor: S. Benjamin Accles
 * Last Modified: 19 November 2024
 * Purpose: This class calculates a user's age given the user's birth date 
 * and the current date.
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgeCalculatorApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Age Calculator\n");
        
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Create a DateTimeFormatter object for formatting dates and times
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(
                FormatStyle.MEDIUM);

        // Get input from the the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String dateOfBirthString = sc.nextLine();
        System.out.println();
        
        // Get and validate user's date of birth
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString);
        
        // If user's date of birth is valid, display the user's date of birth, 
        // the current date, and the user's age
        if (dateOfBirth.isBefore(currentDate)) {
            // Format and print user's date of birth
            System.out.println("Your date of birth is " 
                    + dtf.format(dateOfBirth));

            // Format and print the current date
            System.out.println("The current date is " 
                    + dtf.format(currentDate));

            // Calculate and print the user's age and the number of days that
            // the user has been alive
            long age = ChronoUnit.YEARS.between(dateOfBirth, currentDate);
            long daysAlive = ChronoUnit.DAYS.between(dateOfBirth, currentDate);
            System.out.println("Your age is " 
                    + age + ". " + "You have been on this earth " 
                    + daysAlive + " days!");
        } else {
            System.out.println("Error! Your date of birth cannot be after"
                    + " or equal to today's date.");
        }
    }
}