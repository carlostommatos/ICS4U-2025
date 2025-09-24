package golf;

public class Hole {

    // INSTANCE VARIABLES
    private int number;
    private double distance;
    private int par;
    private double sandtrapLocation;
    private double sandtrapSize;


    // CONSTRUCTORS

    // client picks the number. everything else is random
    public Hole(int n) {

        this.number = n;

        // chooses a random distance based on the number of holes
        this.distance = Math.random() * (550 - 120) + 120;

        // chooses a par based based on the distance
        if (distance <= 200)
            this.par = 3;
        else if (distance <= 400)
            this.par = 4;
        else
            this.par = 5;

    }

    // creates a hole object where the client can choose the number, distance and par
    public Hole(int n, double d, int p) {

        this.number = n;
        this.distance = d;
        this.par = p;

        this.sandtrapSize = Math.random() * (25 - 5) + 5; // random santrap size from 5 to 25
        // add sandtrap location

    }


    // ACCESSORS
    public int getNumber() {
        return this.number;
    }

    public double getDistance() {
        return this.distance;
    }

    public int getPar() {
        return this.par;
    }

    public double getSandtrapLocation() {
        return this.sandtrapLocation;
    }

    public double getSandtrapSize() {
        return this.sandtrapSize;
    }


    // MUTATORS
    // no mutators needed








}
