/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author silas
 */
public class GameScene {
    
    public static void main(String[] args) {
        
        // Create GameCharacter objects named char1 and char2.
        GameCharacter char1 = new GameCharacter("Joe", "Elf", 8, 420);
        GameCharacter char2 = new GameCharacter("Mary", "Wizard");
        
        char2.setCharHealth(5);
        
        // Display message containing some of char1 and char2's attributes. 
        System.out.println(char1.getCharName() + " the " + char1.getCharType() 
                + " is standing at a crossroads. "
                + "Suddenly there is a flash of light and " 
                + char2.getCharName() + " the " + char2.getCharType() 
                + " appears!" + "\n");
        
        // Display char1's health rating and current score.
        System.out.println(char1.getCharName() + "'s health rating is " 
                + char1.getCharHealth());
        System.out.println(char1.getCharName() + "'s current score is " 
                + char1.getCharScore());

        // Display char2's health rating and current score.
        System.out.println(char2.getCharName() + "'s health rating is " 
                + char2.getCharHealth());
        System.out.println(char2.getCharName() + "'s current score is " 
                + char2.getCharScore());
    }
    
}
