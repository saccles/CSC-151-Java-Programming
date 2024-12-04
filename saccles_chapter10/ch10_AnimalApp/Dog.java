/*
 * Class: CSC-151 - Java Programming
 * Author: S. Benjamin Accles
 * Last Modified: 21 October 2024
 * Purpose: This class represents a Dog object and inherits the 
 * Mammal class.
 */

public class Dog extends Mammal {
    private String breed;
    
    public Dog() {
        super();
        breed = "";
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public String getBreed() {
        return breed;
    }
    
    @Override
    public String toString() {
        return ("Breed: " + breed);
    }
}
