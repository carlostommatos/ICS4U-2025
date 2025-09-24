package circle;

/*
Circle
a class for circle objects used in CircleClient
Carlos Matos
Thursday, September 18, 2025
 */

public class Circle {

    // INSTANCE VARIABLES

    private double radius;
    private String units;
    final public double pi = Math.PI;

    // CONSTRUCTOR METHODS

    // constructor method 1 - create a default circle
    // with a radius of 5 and units measured in cm
    public Circle() {
        this.radius = 5;
        this.units = "cm";
    }

    // constructor method 2 - create a circle
    // where the client can choose the radius and units
    public Circle(double rad, String uni) {
        this.radius = rad;
        this.units = uni;
    }





    // ACCESSOR METHODS

    // gets the radius of the given circle object
    public double getRadius() {
        return this.radius;
    }

    // gets the units of the given circle object
    public String getUnits() {
        return this.units;
    }






    // MUTATOR METHODS

    // sets the radius of the given circle object
    public void setRadius(double rad) {
        this.radius = rad;
    }

    // sets the radius of the given circle object
    public void setUnits(String uni) {
        this.units = uni;
    }





    // BEHAVIOURAL / FUNCTIONAL METHODS

    // returns the diameter of the given circle object
    public double calculateDiameter() {
        double diameter = this.radius * 2;
        return diameter;
    }

    // returns the circumference of the given circle object
    public double calculateCircumference() {
        double circumference = 2 * pi * this.radius;
        return circumference;
    }

    // returns the area of the given circle object
    public double calculateArea() {
        double area = pi * Math.pow(this.radius, 2);
        return area;
    }




    // HELPER METHODS

    // takes a decimal number to be rounded
    // and the amount of decimals to round to
    public static double roundNum(double round, int decimals) {
        round = Math.round(round * Math.pow(10, decimals)); // get the correct amount of decimals and round
        round = round * Math.pow(10, decimals * -1); // return the number back to the normal amount of decimals

        return round;
    }



    // toString() method

    public String toString() {

        // this circle's radius
        String circleData1 = "Radius: " + String.valueOf(this.radius);
        // this circle's units
        String circleData2 = "Units: " + this.units;

        // combine the data and return it
        String circleData = circleData1 + "\n" + circleData2;
        return circleData;

    }











}