/*
 * Class: CSC-151 - Java Programming
 * Contributor: S. Benjamin Accles
 * Last Modified: 21 October 2024
 * Purpose: This class represents a Software object and inherits the Product 
 * class.
 */

public class Software extends Product {

    private String version;

    public Software() {
        super();
        version = "";
        count++;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return super.toString() + " " + version;
    }
}