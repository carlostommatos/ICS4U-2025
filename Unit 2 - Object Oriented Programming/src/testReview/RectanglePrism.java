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


}