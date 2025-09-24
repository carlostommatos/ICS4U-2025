package circle;

/*
SphereClient
creates spheres using the Sphere class
Carlos Matos
Thursday, September 18, 2025
 */

public class SphereClient {

    public static void main(String[] args) {

        // create a sphere using the default constructor
        Sphere sphere1 = new Sphere();

        // print the information for the sphere:
        System.out.println("Sphere 1 info:");
        System.out.println(sphere1);
        System.out.println();


        // create a second sphere using explicit values
        Sphere sphere2 = new Sphere(true, 100, "inches");

        // print the information for the sphere:
        System.out.println("Sphere 2 info:");
        System.out.println(sphere2);
        System.out.println();


        // alter the values for the default sphere
        sphere1.setSolid(false);
        sphere1.setRadius(6.7);
        sphere1.setUnits("meters");

        // print the updated information for the sphere:
        System.out.println("Updated Sphere 1 info:");
        System.out.println(sphere1);
        System.out.println();


        // print the diameter, circumference, surface area, and volume for each sphere
        System.out.println("Additional Sphere 1 info:");
        System.out.println("Diameter: " + sphere1.calculateDiameter() + sphere1.getUnits());
        System.out.println("Circumference: " + sphere1.calculateArea() + sphere1.getUnits() + "^2");
        System.out.println("Volume:" + sphere1.calculateVolume() + sphere1.getUnits() + "^3");

        System.out.println();

        System.out.println("Additional Sphere 2 info:");
        System.out.println("Diameter: " + sphere2.calculateDiameter() + sphere2.getUnits());
        System.out.println("Circumference: " + sphere2.calculateArea() + sphere2.getUnits() + "^2");
        System.out.println("Volume:" + sphere2.calculateVolume() + sphere2.getUnits() + "^3");


    }

}
