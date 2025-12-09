package samples;

import java.io.*;

// The "BubbleSort" class.
public class BubbleSortWithTime
{
    public static void main (String[] args) throws IOException
    {

        BufferedReader keybd = new BufferedReader (new InputStreamReader (System.in));

        int numArray[];     //Declare the array

        //User specifies size of array
        System.out.print ("Enter size of array: ");
        int arraySize = Integer.parseInt (keybd.readLine ());

        numArray = new int [arraySize]; //Instantiate the array

        //User specifies range of random numbers to fill the array
        //System.out.print ("Enter lowest value of elements: ");
        //int low = Integer.parseInt (keybd.readLine ());
        int low = -100000;
        //System.out.print ("Enter highest value of elements: ");
        //int high = Integer.parseInt (keybd.readLine ());
        int high = 100000;

        randomFill (numArray, low, high);    //Call to method that fills array


        //*****************************************************
        // Start the clock

        long startTime = System.currentTimeMillis ();


        int temp;
        int index;
        boolean swap;

        do
        {
            swap = false;

            for (index = 0 ; index < numArray.length - 1 ; index++)
            {
                if (numArray [index] > numArray [index + 1])
                {
                    temp = numArray [index];
                    numArray [index] = numArray [index + 1];
                    numArray [index + 1] = temp;

                    swap = true;
                }
            }
        }
        while (swap == true);

        //*****************************************************
        // Check the clock again

        long endTime = System.currentTimeMillis ();
        System.out.println ("Sort took: " + (endTime - startTime) + " ms");




    } // main method


    public static void randomFill (int arrayVal[], int minVal, int maxVal)
    {
        for (int x = 0 ; x <= arrayVal.length - 1 ; x++)
        {
            arrayVal [x] = (int) (Math.random () * (maxVal - minVal + 1)) + minVal;
        }
    }


    public static void display (int[] list)
    {
        for (int a = 0 ; a < list.length ; a++)
            System.out.print (list [a] + " ");
        System.out.println ("\n");

    }
} // BubbleSort class

