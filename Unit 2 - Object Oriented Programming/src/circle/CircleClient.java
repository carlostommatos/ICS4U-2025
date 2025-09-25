package circle;

/*
CircleClient
creates circles using the Circle class
Carlos Matos
Thursday, September 18, 2025
 */

import java.util.Scanner;

public class CircleClient {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // user inputted units to create a circle
        double radius;
        String units;




        System.out.println("Circle Program");
        System.out.println("----------------");
        System.out.println();


        // generate a default circle
        Circle circle1 = new Circle();
        System.out.println("The computer has generated a default circle.");
        System.out.println("These are the details:");
        System.out.println(circle1); // uses the toString() method
        System.out.println();

        // allow the user to change the radius and units
        System.out.print("Change the units to: ");
        units = sc.next();
        circle1.setUnits(units);
        System.out.println("New units: " + circle1.getUnits());
        System.out.println();

        System.out.print("Change the radius to: ");
        radius = sc.nextDouble();
        circle1.setRadius(radius);
        System.out.println("New radius: " + circle1.getRadius() + " " + circle1.getUnits());

        // blank lines
        for (int i = 0; i < 5; i++)
            System.out.println();







        // generate the second circle with user input
        System.out.println("Now make your own circle");

        // the user enters the radius and units for the circle
        System.out.print("Enter the units for the circle: ");
        units = sc.next();

        System.out.print("Enter the radius for the circle: ");
        radius = sc.nextDouble();
        System.out.println();

        // create a circle using the data inputted by the user
        // and print the details
        Circle circle2 = new Circle(radius, units);
        System.out.println("These are the details of your circle");
        System.out.println(circle2);
        System.out.println();

        for (int i = 0; i < 5; i++)
            System.out.println();






        // display the diameter, circumference,
        // and area of each circle with answers
        // rounded to 2 decimal places
        System.out.println("Here is some information about the first circle");
        System.out.println("Diameter: " + Circle.roundNum(circle1.calculateDiameter(), 2) + circle1.getUnits());
        System.out.println("Circumference: " + Circle.roundNum(circle1.calculateCircumference(), 2) + circle1.getUnits());
        System.out.println("Area: " + Circle.roundNum(circle1.calculateArea(), 2) + circle1.getUnits());

        System.out.println();

        System.out.println("Here is some information about the second circle");
        System.out.println("Diameter: " + Circle.roundNum(circle2.calculateDiameter(), 2) + circle2.getUnits());
        System.out.println("Circumference: " + Circle.roundNum(circle2.calculateCircumference(), 2) + circle2.getUnits());
        System.out.println("Area: " + Circle.roundNum(circle2.calculateArea(), 2) + circle2.getUnits());









    }

}


