/*
 * Class: CSC-151 - Java Programming
 * Contributor: S. Benjamin Accles
 * Last Modified: 19 November 2024
 * Purpose: This application simulates the creation of a user account.
 */

import java.util.Scanner;

public class CreateAccountApp {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String fullName = getFullName();
        System.out.println();

        String password = getPassword();
        System.out.println();

        String emailAddress = getEmailAddress();
        System.out.println();

        String phoneNumber = getPhoneNumber();
        System.out.println();

        String msg = getSuccessMessage(fullName, phoneNumber);
        System.out.println(msg);
    }

    private static String getFullName() {
        while (true) {
            System.out.print("Enter full name: ");
            String name = sc.nextLine().trim();
            if (name.contains(" ")) {
                return name;
            } else {
                System.out.println("You must enter your full name.\n");
            }
        }
    }

    private static String getPassword() {
        while (true) {
            System.out.print("Enter password: ");
            String password = sc.nextLine().trim();

            boolean isMinLength = false;
            boolean hasDigit = false;
            boolean hasUppercase = false;

            if (password.length() >= 8) {
                isMinLength = true;
            }

            for (char c : password.toCharArray()) {
                if (Character.isDigit(c)) {
                    hasDigit = true;
                } else if (Character.isUpperCase(c)) {
                    hasUppercase = true;
                }
            }

            if (isMinLength && hasDigit && hasUppercase) {
                return password;
            } else {
                System.out.println("Password must be 8 characters or more\n"
                        + "with at least one digit and one uppercase letter.\n");
            }
        }
    }

    private static String getEmailAddress() {
        while (true) {
            System.out.print("Enter email address: ");
            String emailAddress = sc.nextLine();
            if (emailAddress.contains("@")
                    && emailAddress.endsWith("abtech.edu")) {
                return emailAddress;
            } else {
                System.out.println("Please enter a valid email address.");
            }
        }
    }

    private static String getPhoneNumber() {
        while (true) {
            System.out.print("Enter phone number: ");
            String phoneNumber = sc.nextLine().replace("(", "").replace(")", "").replace("-", "").replace(".", "")
                    .replace(" ", "");
            int requiredLength = 10;
            boolean containsOnlyDigits = true;

            for (char character : phoneNumber.toCharArray()) {
                if (!Character.isDigit(character)) {
                    containsOnlyDigits = false;
                }
            }

            if (phoneNumber.length() == requiredLength
                    && containsOnlyDigits == true) {
                return phoneNumber;
            } else {
                System.out.println("Please enter a 10-digit phone number.");
            }
        }
    }

    private static String getSuccessMessage(
            String fullName, String phoneNumber) {
        int index = fullName.indexOf(" ");
        String firstName = fullName.substring(0, 1).toUpperCase() +
                fullName.substring(1, index).toLowerCase();
        String phoneNumberFormatted = phoneNumber.substring(0, 3) + "."
                + phoneNumber.substring(3, 6) + "."
                + phoneNumber.substring(6);
        return "Hi " + firstName + ", thanks for creating an account!\n"
                + "We'll text your confirmation code to this number: " + phoneNumberFormatted;
    }
}