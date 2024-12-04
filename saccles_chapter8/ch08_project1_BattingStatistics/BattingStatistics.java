/*
 * Class: CSC-151 - Java Programming
 * Author: S. Benjamin Accles
 * Last Modified: 16 October 2024
 * Purpose: This application calculates batting statistics for baseball players.
 */

import java.text.NumberFormat;

public class BattingStatistics {

    public static void main(String[] args) {
        
        // Display a welcoming message.
        System.out.println("Welcome to the Batting Average Calculator");
        
        // Print a blank line.
        System.out.println();
        
        // Keep accepting player batting information and displaying batting 
        // statistics until the user enters something other than "y" or "Y".
        String choice = "y";
        while ( choice.equalsIgnoreCase("y")) {
            String battingPrompt = "Enter number of times at bat: ";
            
            // Get the number of times at bat from the user.
            // Number of times at bat must be greater than 0 and less than 31.
            int timesAtBat = Console.getInt(battingPrompt, 0, 31);
            
            // Print a blank line.
            System.out.println();
            
            // Use the timesAtBat to determine the size of the atBats array.
            int[] atBats = new int[timesAtBat];
            
             String battingRules = "0 = out, 1 = single, "
                    + "2 = double, 3 = triple, 4 = home run";
            
            // Display the batting rules.
            System.out.println(battingRules);
            
            // For each at bat, get the number of bases earned by the user.
            // Number of bases must be greater than -1 and less than 5.
            for (int i = 0; i < atBats.length; i++) {
                int atBat = Console.getInt(
                        ("Result for at-bat " + (i + 1) + ": "), -1, 5);
                atBats[i] = atBat;
            }
                        
            // Print a blank line.
            System.out.println();
            
            // Calculate the batting average.
            double battingAverage = getBattingAverage(atBats);
            
            // Calculate the slugging percent.
            double sluggingPercent = getSluggingPercent(atBats);
            
            // Create a NumberFormat object named number and set the object's 
            // number of decimal places to 3.
            NumberFormat number = NumberFormat.getNumberInstance();
            number.setMaximumFractionDigits(3);
            number.setMinimumFractionDigits(3);

            // Display the batting average and slugging percent.
            System.out.printf(
                    "Batting average: %s \nSlugging percent: %s", 
                    number.format(battingAverage), 
                    number.format(sluggingPercent)
            );
            
            // Print a blank line.
            System.out.println();
            
            String continuePrompt = "Another player? (y/n): ";
            
            // Print a blank line.
            System.out.println();
            
            // See if the user wants to continue.
            choice = Console.getString(continuePrompt);
            
            // Print a blank line.
            System.out.println();
        }
        
        System.out.println("Bye!");
    }
    
    public static double getBattingAverage(int[] atBats) {
        
        // Count the total number of at bats with at least one base.
        int atBatsWithAtLeastOneBase = 0;
        for (int i = 0; i < atBats.length; i++) {
            if (atBats[i] > 0) {
                atBatsWithAtLeastOneBase++;
            }
        }
                
        // Calculate the batting average.
        double battingAverage = (double) 
                atBatsWithAtLeastOneBase / (atBats.length);
                
        return battingAverage;
    }
    
    public static double getSluggingPercent(int[] atBats) {
        
        // Count the total number of bases earned.
        int basesEarned = 0;
        for (int i = 0; i < atBats.length; i++) {
            basesEarned += atBats[i];
        }
        
        // Calculate the slugging percent.
        double sluggingPercent = (double) basesEarned / (atBats.length);
        
        return sluggingPercent;
    }
}
