/*
 * Class: CSC-151 - Java Programming
 * Author: S. Benjamin Accles
 * Last Modified: 21 October 2024
 * Purpose: This application creates Dog and Mammal objects and calls methods
 * of these objects to demonstrate the concept of inheritance in 
 * object-oriented programming. 
 * The Mammal class inherits the Animal class. The Dog class then inherits the
 * Mammal class.
 */

public class AnimalApp {

    public static void main(String[] args) {
        
        // Create a Mammal object (inherits the Animal class).
        Mammal mammal = new Mammal();
        
        // Create a Dog object (inherits the Mammal class).
        Dog dog = new Dog();
        dog.setSpecies("Canine");
        dog.setBreed("Golden Retriever");
        dog.setWarmBlooded(true);
        dog.setSkinType("fur");
        
        // Display the breed of the Dog object (toString() method of 
        // the Dog class overrides the toString() method of the Animal class).
        System.out.println(dog.toString());
    }
}
