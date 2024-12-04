/*
 * Class: CSC-151 - Java Programming
 * Author: S. Benjamin Accles
 * Last Modified: 23 October 2024
 * Purpose: This application lets a user enter a new customer or a new employee
 * and displays and reformats the user's input.
 */

public class PersonManager {

    public static void main(String[] args) {
        System.out.println("Welcome to the Person Manager");
        System.out.println();
        
        String choice = "y";
        while (choice.equals("y")) {
            String personPrompt = "Create customer or employee? (c/e): ";
            String personType = Console.getString(personPrompt, "c", "e");
            System.out.println();
            
            String firstName = Console.getString("First name: ");
            String lastName = Console.getString("Last name: ");
            Person person = null;
            
            // Create a Customer or Employee object based on whether the user
            // chooses "c" (customer) or "e" (employee) for the personType
            // (uses polymorphism to assign the Customer or Employee 
            // object to the person variable).
            if (personType.equals("c")) {
                String customerNumber = Console.getString("Customer number: ");
                Customer customer = new Customer(
                        firstName, lastName, customerNumber);
                person = customer;
            } else if (personType.equals("e")) {
                String ssn = Console.getString("SSN: ");
                Employee employee = new Employee(firstName, lastName, ssn);
                person = employee;
            }
                        
            System.out.println();
            
            try {
                // Display information about the newly-created person.
                 System.out.println("You entered a new " 
                    + person.getClass().getSimpleName() 
                    + ":" + "\n"
                    + person.toString());
                System.out.println();
            } catch (NullPointerException e) {
                System.err.println("Error! An issue occurred while "
                        + "initalizing the Person object.");
                System.err.println(e);
                System.exit(1);
            } catch (Exception e) {
                System.err.println(e);
                System.exit(1);
            }
            
            // See if the user wants to continue.
            String continuePrompt = "Continue? (y/n): ";
            choice = Console.getString(continuePrompt, "y", "n");
            System.out.println();
        }
    }
}
