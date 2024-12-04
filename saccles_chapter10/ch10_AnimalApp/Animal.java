/*
 * Class: CSC-151 - Java Programming
 * Author: S. Benjamin Accles
 * Last Modified: 21 October 2024
 * Purpose: This abstract class is the superclass of the 
 * Mammal and Dog classes and cannot be instantiated as its own object.
 */

public abstract class Animal {
    private String species;
    private boolean warmBlooded;
    protected static int count = 0;
    
    public Animal() {}
    
    public void setSpecies(String species) {
        this.species = species;
    }
    
    public String getSpecies() {
        return species;
    }
    
    public void setWarmBlooded(boolean warmBlooded) {
        this.warmBlooded = warmBlooded;
    }
    
    public boolean getWarmBlooded() {
        return warmBlooded;
    }
    
    @Override
    public String toString() {
        return ("Species: " + species + "\n" + "warmBlooded? " + warmBlooded);  
    }
}
