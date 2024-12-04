/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmlockl2
 */
import java.text.NumberFormat;

public class Car {

	private String vin; // Vehicle ID number
	private String make;
	private String model;
	private int modelYear;
	private String condition;
	private String description;
	private double dealerCost;
	private double cleaningCost;
	private NumberFormat currency = NumberFormat.getCurrencyInstance();

	// no-argument constructor (sets class variables to null, 0, or false, according to data type)
	
	public Car() {
	}

	//constructor to set ALL class variables to values sent as arguments
	
	public Car(String vin, String make, String model, int modelYear, double dealerCost, 
				double cleaningCost, String condition, String description ) {
		
		this.vin = vin;
		this.make = make;
		this.model = model;		
		this.modelYear = modelYear;
		this.dealerCost = dealerCost;
		this.cleaningCost = cleaningCost;
		this.condition = condition;
		this.description = description;
	}
	
	// get methods to access the values of the class variables	
	
	public String getVIN() {
		return vin;
	}	

	public String getMake() {
		return make;
	}	

	public String getModel() {
		return model;
	}	

	public int getModelYear()	{
		return modelYear;
	}	

	public String getCondition()	{
		return condition;
	}	

	public String getDescription()	{
		return description;
	}	

	public double getDealerCost() {
		return dealerCost;
	}	

	public double getCleaningCost() {
		return cleaningCost;
	}	

	// set methods to modify the values of the class variables	
	
	public void setVIN(String vin) {
		this.vin = vin;
	}

	public void setMake(String make) {
		this.make = make;
	}	

	public void setModel(String model) {
		this.model = model;
	}	

	public void setModelYear(int year) {
		this.modelYear = year;
	}	

	public void setCondition(String condition) {
		this.condition = condition;
	}	

	public void setDescription(String description) {
		this.description = description;
	}	

	public void setDealerCost(double cost) {
		this.dealerCost = cost;
	}	

	public void setCleaningCost(double cost) {
		this.cleaningCost = cost;
	}	

	// additional methods to provide useful operations on instances


	// getRetailPrice calculates and returns the retail price of the car
	// Note that this method uses a constant defined in the Dealership class

	public double getRetailPrice () {
		double markup = dealerCost * Dealership.STANDARD_MARKUP;
		return dealerCost + cleaningCost + markup;
	}

	// getCarAd	returns a string advertisement with details about the car
	// Note that this method uses the getRetailPrice method 
	
	public String getCarAd () {

		return "BUY ME!!! " +  make + " " + model + ", " + modelYear + "\n" +
			condition + ". " + description + "\nONLY " + 
			currency.format(getRetailPrice() ) + "!!!!!\n";
	}
	
	public boolean equals (Car otherCar) {
		if (this.vin.equals (otherCar.getVIN()))
			return true;
		else 
			return false;
	}

	public Car copy () {
		Car newCopy = new Car (this.vin, this.make, this.model, 
					this.modelYear, this.dealerCost, 
					this.cleaningCost, this.condition,
					 this.description);
		return newCopy;
	}

}
