/*
 * Class: CSC-151 - Java Programming
 * Author: S. Benjamin Accles
 * Last Modified: 21 October 2024
 * Purpose: This class represents an Mp3 object and inherits the Product class.
 */

public class Mp3 extends Product {
    private String recording;
    
    public Mp3() {
        super();
        recording = "";
        count++;
    }
    
    public void setRecording(String recording) {
        this.recording = recording;
    }
    
    public String getRecording() {
        return recording;
    }
}
