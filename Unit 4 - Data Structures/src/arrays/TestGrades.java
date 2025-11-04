package arrays;

/*
TestGrades
stores and analyzes five test marks earned by twenty students in a class
Carlos Matos
Tuesday, November 4, 2025
 */

public class TestGrades {

    public static void main(String [] args) {

        int [] [] testGrades = new int [5] [20];
        // fill the testGrades array with random numbers
        fillTestMarks(testGrades);

        // print hte testGrades array
        for (int i = 0; i < 5; i++) {
            for (int n = 0; n < 5; n++) {
                System.out.print(testGrades [i] [n] + "    ");
            }
            System.out.println("\n");
        }
        System.out.println();

        // print the lowest grade for test #2
        System.out.println("Lowest grade for Test 2: " + findLowest(testGrades, 2));
        // print how many people got between 90 and 100 on test #2
        System.out.println("How many students got between 90 and 100 on Test 2: "
                + howMany(testGrades, 2, 90, 100));
        // calculate the averages for each test
        int [] averages = testAverages(testGrades);
        System.out.println("\n" + "Test averages: ");
        // print the averages for each test
        for (int i = 0; i < 5; i++)
            System.out.println("Test #" + (i+ 1) + ": " + averages [i] + " ");
    }


    // method that fills the array with random numbers between 40 and 100
    public static void fillTestMarks(int [] [] testGrades) {

        for (int i = 0; i < testGrades.length; i++) { // outer for loop: scan rows
            for (int n = 0; n < testGrades [i].length; n++) { // inner for loop: scan columns

                // random grade between 40 and 100
                testGrades [i] [n] = (int) (Math.random() * (100 - 40 + 1) + 40);

            } // columns
        } // rows
    } // testGrades method


    // method that returns the lowest mark earned on a particular test
    public static int findLowest(int [] [] testGrades, int test) {

        // 100 is the highest possible grade
        int lowestScore = 100;

        // checks each of the grades for a particular test
        for (int i = 0; i < testGrades [test].length; i++) {
            // if the grade is less than the current lowest,
            // the grade becomes the current lowest.
            if (testGrades [test] [i] < lowestScore)
                lowestScore = testGrades [test] [i];
        }
        return lowestScore;
    } // findLowest method


    // method that returns how many students earned a test mark
    // within a particular range for a specific test
    public static int howMany(int [] [] testGrades, int test, int minMark, int maxMark) {

        int inRange = 0; // how many students are in the desired range

        // checks each grade for a particular test
        for (int i = 0; i < testGrades [test].length; i++) {
            // if the grade is in the range, add 1 to inRange
            if (testGrades [test] [i] >= minMark && testGrades [test] [i] <= maxMark)
                inRange++;
        }
        return inRange;
    } // howMany method


    // calculates the class average for each of the five tests
    public static int [] testAverages(int [] [] testGrades) {
        // holds the averages for each test
        int [] averages = new int [testGrades.length];

        for (int i = 0; i < testGrades.length; i++) { // scans each test

            for (int n = 0; n < testGrades [i].length; n++) // scans each student
                averages [i] += testGrades [i] [n];

            averages [i] /= testGrades [i].length; // calculate the average for each test
        }
        return averages;
    } // testAverages method

} // TestGrades class
