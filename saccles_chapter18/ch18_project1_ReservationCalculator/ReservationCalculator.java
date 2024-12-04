/*
 * Class: CSC-151 - Java Programming
 * Author: S. Benjamin Accles
 * Last Modified: 19 November 2024
 * Purpose: This application calculates the total amount for a stay given
 * arrival and departure dates.
 */

import java.time.LocalDate;

public class ReservationCalculator {

    public static void main(String[] args) {
        
        System.out.println("Reservation Calculator");
        System.out.println();
        
        String arrivalMonthPrompt = "Enter the arrival month (1-12): ";
        String arrivalDayPrompt = "Enter the arrival day (1-31): ";
        String arrivalYearPrompt = "Enter the arrival year: ";
        String departureMonthPrompt = "Enter the departure month (1-12): ";
        String departureDayPrompt = "Enter the departure day (1-31): ";
        String departureYearPrompt = "Enter the departure year: ";
        Reservation reservation;
        String choice = "y";
        String continuePrompt = "Continue? (y/n): ";

        while (choice.equals("y")) {
            
            // Get arrival date from user.
            int arrivalMonth = Console.getInt(arrivalMonthPrompt);
            int arrivalDay = Console.getInt(arrivalDayPrompt);
            int arrivalYear = Console.getInt(arrivalYearPrompt);

            System.out.println();

            // Get departure date from user.
            int departureMonth = Console.getInt(departureMonthPrompt);
            int departureDay = Console.getInt(departureDayPrompt);
            int departureYear = Console.getInt(departureYearPrompt);

            // Create a Reservation object named reservation and set the
            // arrival and departure dates based on the arrival and departure
            // dates entered by the user.
            reservation = new Reservation();
            reservation.setArrivalDate(
                LocalDate.of(arrivalYear, arrivalMonth, arrivalDay));
            reservation.setDepartureDate(
                LocalDate.of(departureYear, departureMonth, departureDay));
            
            System.out.println();

            // Format and display the arrival and departure dates entered by 
            // the user. 
            // Also format and display the price per night and 
            // the total price for the given stay.
            System.out.println("Arrival Date: " 
                    + reservation.getArrivalDateFormatted());
            System.out.println("Departure Date: " 
                    + reservation.getDepartureDateFormatted());
            System.out.println("Price: " 
                    + reservation.getPricePerNightFormatted() 
                    + " per night");
            System.out.println("Total price: " 
                    + reservation.getTotalPriceFormatted() 
                    + " for " 
                    + reservation.getNumberOfNights() 
                    + " nights");

            System.out.println();

            // See if the user wants to continue.
            choice = Console.getString(continuePrompt);
            System.out.println();
        }

        System.out.println("Bye!");
    }
}