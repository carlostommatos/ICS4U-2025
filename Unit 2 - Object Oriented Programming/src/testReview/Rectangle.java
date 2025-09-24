
package testReview;

public class Rectangle {

    private double length;
    private double width;
    private String units;


    // CONSTRUCTOR METHODS

    // default constructor
    // rectangle object with length of 8m and width of 3m
    public Rectangle() {

        this.length = 8;
        this.width = 3;
        this.units = "m";

    }

    // user is allowed to specify the length and width and units
    public Rectangle(double length, double width, String units) {

        this.length = length;
        this.width = width;
        this.units = units;

    }

    // ACCESSOR METHODS
    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public String getUnits() {
        return this.units;
    }


    // MUTATOR METHODS
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setUnits(String units) {
        this.units = units;
    }


    // BEHAVIOUR METHODS
    public double calculatePerimieter() {
        return 2 * (this.length + this.width);
    }

    public double calculateArea() {
        return this.length * this.width;
    }

    public boolean isSquare() {
        if (this.length == this.width) {
            return true;
        }

        else {
            return false;
        }
    }



    public String toString() {
        String info = "Length: " + this.length + "\n"
                + "Width: " + this.width + "\n";
        return info;
    }

    
}