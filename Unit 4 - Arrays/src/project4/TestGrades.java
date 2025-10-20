package project4;

public class TestGrades {

    public static void main(String [] args) {

        int [] [] testGrades = new int [20] [5];
        fillTestMarks(testGrades);
        System.out.println(findLowest(testGrades, 2));
        System.out.println(howMany(testGrades, 2, 0, 100));

    }

    public void fillTestMarks(int [] [] testGrades) {

        for (int i = 0; i < testGrades.length; i++) { // outer for loop: scan rows

            for (int n = 0; n < testGrades [i].length; n++) {

                // random grade between 40 and 100
                testGrades [i] [n] = (int) (Math.random() * (100 - 40) + 40);

            } // columns

        } // rows

    }

    public int findLowest(int [] [] testGrades, int test) {

        int lowestScore = 100;

        for (int i = 0; i < testGrades [test].length; i++) {

            if (testGrades [test] [i] < lowestScore)
                lowestScore = testGrades [test] [i];

        }

        return lowestScore;

    }

    public int howMany(int [] [] testGrades, int test, int minMark, int maxMark) {

        int inRange = 0;
        for (int i = 0; i < testGrades [test].length; i++) {

            if (testGrades [test] [i] >= minMark && testGrades [test] [i] <= maxMark)
                inRange++;

        }

        return inRange;
    }

    public int testAverages(int [] [] testGrades) {

        int [] averages = new int [testGrades.length];

        for (int i = 0; i < averages; i++)


    }




}
