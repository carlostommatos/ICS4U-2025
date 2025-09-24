package golf;

/*
GolfClub
a class for golf club objects used in the PlayGolfClient
Carlos Matos
Wednesday, September 24, 2025
 */

public class GolfClub {

    // INSTANCE VARIABLES
    private String clubType;
    private double minDistance;
    private double maxDistance;


    // CONSTRUCTORS

    // creates a club where the client chooses the club type
    public GolfClub(String type) {
        this.clubType = type;

        switch (type) { // sets the min and max distance based on the club type
            case "wood":
                this.minDistance = 150;
                this.maxDistance = 300;
                break;
            case "iron":
                this.minDistance = 10;
                this.maxDistance = 150;
                break;
            case "putter":
                this.minDistance = 1;
                this.maxDistance = 10;
                break;
        }

    } // GolfClub constructor



    // ACCESSOR METHODS

    public String getClubType() {
        return this.clubType;
    }

    public double getMinDistance() {
        return this.minDistance;
    }

    public double getMaxDistance() {
        return this.maxDistance;
    }



    // MUTATOR METHODS

    public void setClubType(String type) {
        this.clubType = type;
    }

    public void setMinDistance(double min) {
        this.minDistance = min;
    }

    public void setMaxDistance(double max) {
        this.maxDistance = max;
    }



    // BEHAVIOUR METHODS
    public double swing(int force) {

        double distance = 0;

        switch (force) {

            case 1: // light force: range is min distance to halfway between the min and max distance
                // I---I-----
                distance = Math.random() * ((this.maxDistance - this.minDistance) / 2) + this.minDistance;
                break;
            case 2: // regular force: range is 1/4 between the min and max distance to 3/4 the min and max distance
                // --I---I--
                distance = Math.random() * ((this.maxDistance - this.minDistance) / 2)
                        + minDistance + ((this.maxDistance - this.minDistance) / 4);
                break;
            case 3: // strong force: range is half between the min and max distance to the max distance
                // ----I----I
                distance = Math.random() * ((this.maxDistance - minDistance) / 2)
                        + ((this.maxDistance + this.minDistance) / 2);
                break;
        }
        return distance;
    }


    public String toString() {
        String info = "Club Type: " + this.clubType +
                "\n" + "Min Distance: " + this.minDistance +
                "\n" + "Max Distance: " + this.maxDistance;
        return info;
    }



}