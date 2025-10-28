package samples;

public class TwoDArraySample {

    public static void main (String[] args)
    {
        String[] namesArray = {"Carlos", "Gavin", "Manny", "Cali", "Dara", "Linkin", "Issic", "Josh"};

        // Carlos - Row 0
        // Gavin - Row 1
        // Immanuel - Row 2
        // Cali - Row 3
        // Dara - Row 4
        // Linkin - Row 5
        // Issic - Row 6
        // Josh - Row 7
        //
        // Grade 9 - Col 0
        // Grade 10 - Col 1
        // Grade 11 - Col 2
        // Grade 12 - Col 3

        // Creating a 2-D array recording
        // the number of dates each student
        // had over the four years at school
        // DECLARE
        // 7 rows and 4 columns
        int[] [] datesArray = new int [8] [4];

        //Fill one element - Carlos, gr. 9, 1 date
        datesArray [0] [0] = 1;

        //TRAVERSING a 2D Array
        //Outer for loop - scan rows
        //Inner for loop - scan columns
        for (int r = 0 ; r < datesArray.length ; r++)
        {
            for (int c = 0 ; c < datesArray[r].length ; c++)
            {
                datesArray [r] [c] = (int) (Math.random () * (30 - 0 + 1) + 0);
            } //columns

        } //rows

        //Display contents of array

        for (int r = 0 ; r < datesArray.length ; r++)
        {
            System.out.print(namesArray[r] + "\t");
            for (int c = 0 ; c < datesArray[r].length ; c++)
            {
                System.out.print (datesArray [r] [c] + "\t");
            } //columns
            System.out.println();
        } //rows

        //Manipulation of 2D array

        int avgDates[] = new int[8];

        //Call to method
        avgDates= averageDates(namesArray,datesArray);

        for (int index = 0; index <8;index ++)
        {
            System.out.println(namesArray[index] + "'s average # of dates: " + avgDates[index]);
        }



    }//main method

    public static int[] averageDates (String[] array1, int[][] array2)
    {
        //Try to get everyone's dating average
        int[] avg = new int[array1.length];

        for (int r = 0 ; r < array1.length ; r++)
        {
            avg[r] = 0;
            for (int c = 0 ; c < 4 ; c++)
            {
                //totalling for the rth row.
                avg[r] = avg[r] + array2 [r] [c];
            }
            // calculating the average for row r
            avg[r] = avg[r] / 4;
        }

        return avg; // return the average array

    }//averageDates
}//class







