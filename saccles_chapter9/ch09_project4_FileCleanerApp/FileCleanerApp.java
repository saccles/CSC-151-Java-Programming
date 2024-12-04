/*
 * Class: CSC-151 - Java Programming
 * Author: S. Benjamin Accles
 * Last Modified: 21 October 2024
 * Purpose: This application reads a file that contains an email list, 
 * reformats the data, and writes the cleaned list to another file.
 * Rules for reformatting data:
 *  - all names should use title case
 *  - all email addresses should be lowercase
 *  - all extra spaces at the start or end of a string should be removed
 *  - if the email address is blank, print “no email provided”
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class FileCleanerApp {

    public static void main(String[] args) {
    
        String inputFilename = "prospects.csv";
        String outputFilename = "prospects_clean.csv";
        
        System.out.println("File Cleaner");
        System.out.println();
        System.out.println("Source file: " + inputFilename);
        System.out.println("Cleaned file: " + outputFilename);
        System.out.println();
        
        // Read the input file into the prospects ArrayList.
        ArrayList<String> prospects = readFileIntoArrayList(inputFilename);
        
        // Clean the ArrayList based on certain rules (see program rules) and 
        // create a new, clean ArrayList named cleanedProspects.
        ArrayList<String> cleanedProspects = cleanArrayList(prospects);
                
        // Write the processed ArrayList to a new file.
        writeArrayListToFile(cleanedProspects, outputFilename);
        
        System.out.println("Congratulations! Your file has been cleaned!");
    }
        
    public static ArrayList<String> readFileIntoArrayList(
            String inputFilename) {
        ArrayList<String> prospects = new ArrayList<String>();
         
       try (BufferedReader in = new BufferedReader(
                                new FileReader(inputFilename))) {
            String prospect = in.readLine();
            while (prospect != null) {
                prospects.add(prospect);
                prospect = in.readLine();
            }            
        } catch (FileNotFoundException e) {
            System.err.println("Error! " + inputFilename + " does not exist.");
            return null;
        } catch (IOException e) {
            System.err.println(e);
            return null;
        }
        
        return prospects;
    }
    
    public static ArrayList<String> cleanArrayList(
            ArrayList<String> prospects) {
        ArrayList<String> cleanedProspects = new ArrayList<String>();
        String[] cleanedProspect = new String[3];
        
        // Apply the data reformatting rules to each entry in the prospects 
        // ArrayList.
        String[] prospectEntries;
        String firstName;
        String lastName;
        String emailAddress;
        for (String prospect: prospects) {
            
            // Split each prospect into an array of 3 strings, 
            // (firstName, lastName, emailAddress) delimited by a comma.
            // -1 is a limit parameter that preserves trailing empty strings.
            // "Youlanda,Schemmer," gets split into "Youlanda", "Schemmer", "".
            prospectEntries = prospect.split(",", -1);
            firstName = prospectEntries[0];
            lastName = prospectEntries[1];
            
            if (prospectEntries[2].isBlank()) {
                emailAddress = "no email provided";
            } else {
                emailAddress = prospectEntries[2];
            }
            
            cleanedProspect[0] = titleCaseWord(firstName.strip());
            cleanedProspect[1] = titleCaseWord(lastName.strip());
            cleanedProspect[2] = emailAddress.toLowerCase().strip();
            
            cleanedProspects.add(
                    Arrays.toString(cleanedProspect).replace(", ", ","));
        }
                
        return cleanedProspects;
    }
    
    public static void writeArrayListToFile(
            ArrayList<String> cleanedProspects, String outputFilename) {
        try (PrintWriter out = new PrintWriter(
                               new BufferedWriter(
                               new FileWriter(outputFilename)))) {
            for (String cleanedProspect: cleanedProspects) {
                
                // Remove the brackets (result of Arrays.toString() method) 
                // from each prospect before writing each 
                // prospect to the new file. 
                out.println(cleanedProspect.replace("[", "").
                                            replace("]", ""));
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    
    public static String titleCaseWord(String word) {
        String titleCasedWord = word.substring(0, 1).toUpperCase() 
                + word.substring(1).toLowerCase();
        
        return titleCasedWord;
    }
}   
