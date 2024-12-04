/*
 * Class: CSC-151 - Java Programming
 * Author: S. Benjamin Accles
 * Last Modified: 21 October 2024
 * Purpose: This class represents a Mammal object and inherits the 
 * Animal class.
 */

public class Mammal extends Animal {
    private String skinType;
    
    public Mammal() {
        super();
        skinType = "";
        count++;
    }
    
    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }
    
    public String getSkinType() {
        return skinType;
    }
}
