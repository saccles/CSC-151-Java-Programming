/*
 * Class: CSC-151 - Java Programming
 * Author: S. Benjamin Accles
 * Last Modified: 21 October 2024
 * Purpose: This class represents an Album object and inherits the 
 * Product class.
 */

public class Album extends Product {
    private String artist;
    
    public Album() {
        super();
        artist = "";
        count++;
    }
    
    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    public String getArtist() {
        return artist;
    }
    
    @Override
    public String toString() {
        return (super.toString() + " (" + artist + ")" );
    }
}
