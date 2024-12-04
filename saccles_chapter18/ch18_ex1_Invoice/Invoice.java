/*
 * Class: CSC-151 - Java Programming
 * Contributor: S. Benjamin Accles
 * Last Modified: 19 November 2024
 * Purpose: This class represents an Invoice object.
 */

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;

public class Invoice {

    // the instance variables
    private ArrayList<LineItem> lineItems;
    private LocalDateTime invoiceDate;
    private DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(
                FormatStyle.MEDIUM);
    
    // the constructor
    public Invoice() {
        lineItems = new ArrayList<>();
        invoiceDate = LocalDateTime.now();

    }

    public void addItem(LineItem lineItem) {
        lineItems.add(lineItem);
    }

    public ArrayList<LineItem> getLineItems() {
        return lineItems;
    }

    public double getTotal() {
        double invoiceTotal = 0;
        for (LineItem lineItem : lineItems) {
            invoiceTotal += lineItem.getTotal();
        }
        return invoiceTotal;
    }

    public String getTotalFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(getTotal());
    }
    
    public void setDate(LocalDateTime invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public LocalDateTime getDate() {
        return invoiceDate;
    }

    public String getDateFormatted() {      
        return dtf.format(invoiceDate);
    }

    public LocalDateTime getDueDate() {
        return invoiceDate.plusDays(30);
    }

    public String getDueDateFormatted() {
        return dtf.format(invoiceDate.plusDays(30));
    }
}