package project4;

public class TestGrades {

    public static void main(String [] args) {

        int [] [] testGrades = new int [5] [20];
        fillTestMarks(testGrades);
        System.out.println("Lowest grade for Test 2: " + findLowest(testGrades, 2));
        System.out.println("How many students got between 90 and 100 on Test 2: "
                + howMany(testGrades, 2, 90, 100));
        int [] averages = testAverages(testGrades);
        System.out.println("\n" + "Test averages: ");

        for (int i = 0; i < 5; i++)
            System.out.println(averages [i] + " ");
    }

    public static void fillTestMarks(int [] [] testGrades) {

        for (int i = 0; i < testGrades.length; i++) { // outer for loop: scan rows

            for (int n = 0; n < testGrades [i].length; n++) {

                // random grade between 40 and 100
                testGrades [i] [n] = (int) (Math.random() * (100 - 40 + 1) + 40);

            } // columns

        } // rows

    }

    public static int findLowest(int [] [] testGrades, int test) {

        int lowestScore = 100;

        for (int i = 0; i < testGrades [test].length; i++) {

            if (testGrades [test] [i] < lowestScore)
                lowestScore = testGrades [test] [i];

        }

        return lowestScore;

    }

    public static int howMany(int [] [] testGrades, int test, int minMark, int maxMark) {

        int inRange = 0;

        for (int i = 0; i < testGrades [test].length; i++) {

            if (testGrades [test] [i] >= minMark && testGrades [test] [i] <= maxMark)
                inRange++;

        }

        return inRange;
    }

    public static int [] testAverages(int [] [] testGrades) {

        int [] averages = new int [testGrades.length];

        for (int i = 0; i < testGrades.length; i++) {

            for (int n = 0; n < testGrades [i].length; n++) {

                averages [i] += testGrades [i] [n];

            }

            averages [i] /= testGrades [i].length;

        }

        return averages;

    }



}
