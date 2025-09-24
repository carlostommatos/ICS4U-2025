package circle;

public class Sphere extends Circle {

    // INSTANCE VARIABLES
    private boolean solid;


    // CONSTRUCTORS

    // default constructor
    // solid sphere with radius of 5cm
    public Sphere() {
        super(); // default constructor for circle class has radius of 5cm
        this.solid = true;
    }

    // sphere where client can pick solidity, radius, and units
    public Sphere(boolean solid, double radius, String units) {
        super(radius, units); // triggers the second Circle constructor
        this.solid = solid;
    }


    // ACCESSORS
    public boolean getSolid() {
        return this.solid;
    }

    // MUTATORS
    public void setSolid(boolean solid) {
        this.solid = solid;
    }


    // BEHAVIOURS

    // same method name in circle class. This one overrides ---> sub-type polymorphism
    public double calculateArea() { // calculates the surface area of the sphere
        double area = 4 * pi * Math.pow(this.getRadius(), 2);
        return area;
    }

    public double calculateVolume() {
        double volume = (4/3) * pi * Math.pow(this.getRadius(), 3);
        return volume;
    }



    public String toString() {
        return super.toString() + "\n" + "solid: " + this.solid;
    }


}
