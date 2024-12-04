/*
 * Class: CSC-151 - Java Programming
 * Author: S. Benjamin Accles
 * Last Modified: 7 October 2024
 * Purpose: This class models the A-B Tech Community College.
 */

public class Abtech {
    public static final int YEAR_STARTED = 1895;
    public static final String SCHOOL_NAME = "AB Tech";
    public static final String SCHOOL_URL = "www.abtech.edu";
    private static final String SCHOOL_ADDRESS = 
            "314 Victoria Rd, Asheville, NC, 28715";
    public static final String SCHOOL_SLOGAN = 
            "Locally Committed * Regionally Dynamic  * World-Class Focused";
    public static final double FULL_TIME_TUITION = 915.50;
    
    public static String getSchoolBanner() {
        return SCHOOL_NAME + "\n(Serving students since " + 
                YEAR_STARTED + ")\n" + SCHOOL_ADDRESS + "\n" +
                SCHOOL_URL + "\n" + SCHOOL_SLOGAN + "\n";
    }
    
    public static double getTuitionCost(boolean inState, int hours) {
        int tuitionPerHour = 0;
        double tuition = 0.0;
        if (inState) {
            tuitionPerHour = 45;
        } else {
            tuitionPerHour = 90;
        }
        tuition = tuitionPerHour * hours;
        
        return tuition;
    }
}
