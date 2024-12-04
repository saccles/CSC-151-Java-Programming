/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmlockl2
 */
public class IntroducingObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int yearsInBusiness = Dealership.getYearsInBusiness();
        String companyEmail = Dealership.COMPANY_EMAIL;
        
        System.out.println(""
                + "We've been operating now for " + yearsInBusiness + " years! "
                + "To talk to one of our sales people, send an email to " 
                + companyEmail + "." + "\n");
        
        double dealerCost = 250.0;
        double cleaningCost = 150.0;
        
        double retailCost = Dealership.getRetailPrice(dealerCost, cleaningCost);
        
        // Display retail cost.
        System.out.println("Your retail cost is: $" + retailCost + "\n");
        
        // Create Car objects named car1, car2, and car3.
        Car car1 = new Car();
        Car car2 = new Car(
                "JH4CL96808C", "Toyota", "Prius", 2005, dealerCost, 
                cleaningCost, "Good condition", "Fuel-efficient car.");
        Car car3 = new Car(
                "AM4DL33805D", "Honda", "Fit", 2001, dealerCost, 
                cleaningCost, "Decent condition", "Compact, reliable car.");
        
        // Set attributes of car1.
        car1.setVIN("MF2SW41931G");
        car1.setMake("Subaru");
        car1.setModel("Outback");
        car1.setModelYear(1999);
        car1.setDealerCost(200.0);
        car1.setCleaningCost(130.0);
        car1.setCondition("Bad condition");
        car1.setDescription("Old, medium-sized car.");
        
        // Create a Car object named car4 with the same attributes as car1.
        Car car4 = car1.copy();
        
        // Change the model year and dealer cost attributes of car4.
        car4.setModelYear(2011);
        car4.setDealerCost(1000.0);
        
        String car1Ad = car1.getCarAd();
        String car2Ad = car2.getCarAd();
        String car3Ad = car3.getCarAd();
        String car4Ad = car4.getCarAd();
        
        // Display available vehicles.
        System.out.println("*Available Vehicles*" + "\n" +
                "\n" + car1Ad + "\n" + car2Ad + 
                "\n" + car3Ad + "\n" + car4Ad);
    }
    
}
