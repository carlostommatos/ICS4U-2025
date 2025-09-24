package golf;

/*
PlayGolfClient
plays two holes of golf using objects from the GolfClub and Hole classes
Carlos Matos
Wednesday, September 24, 2025
 */

import java.util.Scanner;

public class PlayGolfClient {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Club information:");
        System.out.println();

        // generate the three clubs from the GolfClub class
        GolfClub putter = new GolfClub("putter");
        GolfClub iron = new GolfClub("iron");
        GolfClub wood = new GolfClub("wood");

        // output the characteristics of each club
        System.out.println(putter);
        System.out.println();

        System.out.println(iron);
        System.out.println();

        System.out.println(wood);
        System.out.println();
        System.out.println();

        // generate the first hole using the default Hole constructor
        Hole hole1 = new Hole(1);
        System.out.println("Hole 1 Infomration:");
        System.out.println(hole1); // print the characteristics
        System.out.println();





        // FIRST HOLE

        double remainingDistance = hole1.getDistance(); // tracks how far the ball is from the hole

        // variables to store the user's club and force every turn
        String chosenClub = "";
        int force = 0;
        double swingDistance = 0;
        boolean inSandtrap = false;
        int swings = 1;

        // repeat as long as the ball is more than 5 yards from the hole
        while (Math.abs(remainingDistance) > 5) { // absolute value makes the ball be able to go past the hole

            System.out.println("Swing # " + swings);
            // get the club type and force from the user

            System.out.print("What club would you like to use: ");
            chosenClub = sc.nextLine();

            System.out.print("How much force would you like to use: ");
            force = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (chosenClub) { // swings whatever club the user chose with the force they want
                case "putter":
                    swingDistance = putter.swing(force);
                    break;
                case "iron":
                    swingDistance = iron.swing(force);
                    break;
                case "wood":
                    swingDistance = wood.swing(force);
                    break;
            }


            if (inSandtrap) { // makes the swing distance half if the ball is in the sandtrap
                swingDistance = swingDistance / 2;
                inSandtrap = false;
            }

            // find the distance from the hole
            remainingDistance = Math.abs(remainingDistance - swingDistance);
            // absolute value lets the ball go past the hole
            System.out.println("Distance to Hole: " + remainingDistance);
            System.out.println();

            // if the ball location is in the range of the sandtrap
            // the first condition checks if it is in the minimum range of the sandtrap
            // the second condition checks if it is in the maximum range of the sandtrap
            // if both are true, the ball is in the sandtrap
            if ( (remainingDistance >= hole1.getSandtrapLocation() - hole1.getSandtrapSize() / 2) &&
                (remainingDistance <= hole1.getSandtrapLocation() + hole1.getSandtrapSize() / 2) ) {

                inSandtrap = true;
                System.out.println("The ball is in the sandtrap");
                System.out.println();

            }

            swings++;

        } // end of the first game

        swings = swings - 1; // because the swing count starts at 1

        // print results and a unique message for over, under, or equal to the par
        System.out.println("It took " + swings + " to sink the ball.");
        if (swings < hole1.getPar()) { // under par
            System.out.println("You were " + (hole1.getPar() - swings) + " under par.");
        }
        else if (swings == hole1.getPar()) { // on par
            System.out.println("You were on par!");
        }
        else { // over par
            System.out.println("You were " + (hole1.getPar() - swings) + " over par.");
        }

        for (int i = 0; i < 5; i++) // make a bunch of empty lines
            System.out.println();









        // SECOND HOLE
        // generate the first hole using the second Hole constructor
        Hole hole2 = new Hole(2, 550, 5);
        System.out.println("This is the information for hole 2:");
        System.out.println(hole2); // print the characteristics
        System.out.println();


        // reset variables
        remainingDistance = hole2.getDistance(); // tracks how far the ball is from the hole

        // variables to store the user's club and force every turn
        chosenClub = "";
        force = 0;
        swingDistance = 0;
        inSandtrap = false;
        swings = 1;

        // repeat as long as the ball is more than 5 yards from the hole
        while (Math.abs(remainingDistance) > 5) { // absolute value makes the ball be able to go past the hole

            System.out.println("Swing # " + swings);
            // get the club type and force from the user

            System.out.print("What club would you like to use: ");
            chosenClub = sc.nextLine();

            System.out.print("How much force would you like to use: ");
            force = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (chosenClub) { // swings whatever club the user chose with the force they want
                case "putter":
                    swingDistance = putter.swing(force);
                    break;
                case "iron":
                    swingDistance = iron.swing(force);
                    break;
                case "wood":
                    swingDistance = wood.swing(force);
                    break;
            }


            if (inSandtrap) { // makes the swing distance half if the ball is in the sandtrap
                swingDistance = swingDistance / 2;
                inSandtrap = false;
            }

            // find the distance from the hole
            remainingDistance = Math.abs(remainingDistance - swingDistance);
            // absolute value lets the ball go past the hole
            System.out.println("Distance to Hole: " + remainingDistance);
            System.out.println();

            // if the ball location is in the range of the sandtrap
            // the first condition checks if it is in the minimum range of the sandtrap
            // the second condition checks if it is in the maximum range of the sandtrap
            // if both are true, the ball is in the sandtrap
            if ( (remainingDistance >= hole2.getSandtrapLocation() - hole2.getSandtrapSize() / 2) &&
                    (remainingDistance <= hole2.getSandtrapLocation() + hole2.getSandtrapSize() / 2) ) {

                inSandtrap = true;
                System.out.println("The ball is in the sandtrap");
                System.out.println();

            }

            swings++;

        } // end of the first game

        swings = swings - 1; // because the swing count starts at 1

        // print results and a unique message for over, under, or equal to the par
        System.out.println("It took " + swings + " to sink the ball.");
        if (swings < hole2.getPar()) { // under par
            System.out.println("You were " + (hole2.getPar() - swings) + " under par.");
        }
        else if (swings == hole2.getPar()) { // on par
            System.out.println("You were on par!");
        }
        else { // over par
            System.out.println("You were " + (hole2.getPar() - swings) + " over par.");
        }
    }

}
