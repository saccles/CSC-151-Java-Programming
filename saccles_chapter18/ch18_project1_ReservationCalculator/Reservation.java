/*
 * Class: CSC-151 - Java Programming
 * Author: S. Benjamin Accles
 * Last Modified: 19 November 2024
 * Purpose: This class represents a Reservation object.
 */

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Reservation {
    private LocalDate arrivalDate;
    private LocalDate departureDate;
    public static final DateTimeFormatter dateTimeFormatter = 
                        DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
    public static final NumberFormat currencyFormatter = 
                        NumberFormat.getCurrencyInstance();
    public static final double NIGHTLY_RATE = 145.0;

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    } 

    public String getArrivalDateFormatted() {
        return dateTimeFormatter.format(arrivalDate);
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public String getDepartureDateFormatted() {
        return dateTimeFormatter.format(departureDate);
    }

    public int getNumberOfNights() {
        return (int) ChronoUnit.DAYS.between(arrivalDate, departureDate);
    }

    public String getPricePerNightFormatted() {
        return currencyFormatter.format(NIGHTLY_RATE);
    }

    public double getTotalPrice() {
        return (NIGHTLY_RATE * getNumberOfNights());
    }

    public String getTotalPriceFormatted() {
        return currencyFormatter.format(NIGHTLY_RATE * getNumberOfNights());
    }
}