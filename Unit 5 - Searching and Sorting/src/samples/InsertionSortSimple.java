package samples;

//In the insertion sort,
//  - each element is examined one at a time
//  - the element is compared to the elements physically behind it (i.e. at
//      lesser indices).
//  - when the new location for that element is found, elements between
//      the new location and the old one must be shifted forward.
//  - the element then goes into its new location.
//This sort is done in-place.
import java.io.*;
public class InsertionSortSimple
{

    public static void main (String[] args) throws IOException
    {
        int numArray[] = new int [20];  //Declare the array to be sorted


        //Fill the integer array with random numbers from -200 to +300
        for (int x = 0 ; x < numArray.length ; x++)
        {
            numArray [x] = (int) (Math.random () * (300 - (-200) + 1)) + (-200);
        }

        displayArray (numArray); //Display unsorted array



        //*****Perform the Insertion Sort on the array
        int temp; //temporary holder for the key element
        //Helps with the shifting.

        //Actual sorting takes place at element 1; It is assumed
        //that element 0 is in order because it is alone at that point.

        //indexKey is the subscript for the current element
        //that is being placed in the right location.
        for (int indexKey = 1 ; indexKey < numArray.length ; indexKey++)
        {
            // to see if it is out of order.

            //Check if current element is out of order.
            //we know this if the element to it's left is
            //bigger (ASCENDING ORDER)
            if ((numArray [indexKey] < numArray [indexKey - 1]) && (indexKey > 0))
            {

                //Store the element
                temp = numArray [indexKey]; //Current element we are examining

                //Element is out of place so we have to scan
                //the array to find where we belong.
                int rightLoc = indexKey - 1; //rightLoc will keep
                //moving left to find the right location of the element

                while (temp < numArray [rightLoc])
                {
                    rightLoc--;
                    //temp belongs as the very first element
                    if (rightLoc == -1)
                        break;
                } //end while loop
                rightLoc++;  //This is the right spot for the element to go

                //Now call on the method with the right info for the arguments.
                shift (numArray, rightLoc, indexKey);

            } //end if


        } //End for loop
        //*****

        displayArray (numArray);  //Display newly sorted array

    } //main method


    //Method to shift over a set of elements
    //
    // list - the array that holds the values being rearrranged.
    // newIndex - the new location of the element located at oldIndex.
    // newIndex to oldIndex --> range of shift.
    public static void shift (int[] list, int newIndex, int oldIndex)
    {
        int temp = list [oldIndex]; //Creating a temporary variable.

        for (int x = oldIndex ; x > newIndex ; x--)
        {
            list [x] = list [x - 1];    //Move each element over
        } //end For loop

        list [newIndex] = temp; //Putting the temp into the correct spot.
    } // Shift ()


    //Method to display a one dimensional integer array
    public static void displayArray (int arrayVal[])
    {
        for (int x = 0 ; x <= arrayVal.length - 1 ; x++)
        {
            System.out.println ("Element " + x + ": " + arrayVal [x]);
        }
        System.out.println ("\n\n");
    }
} //InsertionSortSimple