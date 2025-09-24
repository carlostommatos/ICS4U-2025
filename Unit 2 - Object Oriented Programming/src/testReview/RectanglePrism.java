package testReview;

public class RectanglePrism extends Rectangle {

    // INSTANCE VARIABLES
    private double height;

    // CONSTURCTOR METHODS

    // default contructor
    public RectanglePrism() {
        super();
        this.height = 6;
    }

    // client can specify length, width, and height
    public RectanglePrism(double length, double width, double height, String units) {
        super(length, width, units);
        this.height = height;
    }


    // ACCESSOR METHODS
    public double getHeight() {
        return this.height;
    }

    // MUTATOR METHODS
    public void setHeight(double height) {
        this.height = height;
    }


    // BEHAVIOUR METHODS
    public double calculateArea() {
        return 2 * ((this.getWidth() * this.height)
                + (this.getLength() * this.getWidth()) + (this.getLength() * this.height));
    }

    public double calculateVolume() {
        return this.getLength() * this.getWidth() * this.height;
    }

    public boolean isCube() {
        if (this.getLength() == this.getWidth() && this.getWidth() == this.height) {
            return true;
        }
        else {
            return false;
        }
    }


    // HELPER METHODS
    public String toString() {
        return super.toString() + "\n" + "Height: " + this.height;
    }

}