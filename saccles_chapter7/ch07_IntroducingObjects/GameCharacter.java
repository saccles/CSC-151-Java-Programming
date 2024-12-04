/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author silas
 */
public class GameCharacter {
    private String charName;
    private String charType;
    private int charHealth;
    private int charScore;
    
    public GameCharacter(String charName, String charType,
            int charHealth, int charScore) {
        this.charName = charName;
        this.charType = charType;
        this.charHealth = charHealth;
        this.charScore = charScore;
    }
    
    public GameCharacter(String charName, String charType) {
        this.charName = charName;
        this.charType = charType;
        charHealth = 0;
        charScore = 0;
    }
    
    public String getCharName() {
        return charName;
    }
    
    public String getCharType() {
        return charType;
    }
    
    public int getCharHealth() {
        return charHealth;
    }
    
    public int getCharScore() {
        return charScore;
    }
    
    public void setCharName(String charName) {
        this.charName = charName;
    }
    
    public void setCharType(String charType) {
        this.charType = charType;
    }
    
    public void setCharHealth(int charHealth) {
        this.charHealth = charHealth;
    }
  
    public void setCharScore(int charScore) {
        this.charScore = charScore;
    }
        
}
