package samples;

//Use the binary search technique to locate a specific
//value in a sorted array.

public class BinarySearchSampleInClass
{
    public static void main (String[] args)
    {
        int[] numArray = new int [50];
        int searchNum; //Number we are searching for--> KEY

        //Fill array with sorted numbers -- low to high
        for (int index = 0 ; index < numArray.length ; index++)
        {
            numArray [index] = index * 7;
            System.out.println ("Element " + index + ": " + numArray [index] + " ");
        } //end for

        searchNum = 28;

        //Call the search method
        //It will return:
        // ~ integer reflecting the index of where number was found
        // ~ -1 reflecting the number was NOT found in the array
        int whereFound = myBinarySearch (numArray, searchNum);

        if (whereFound == -1)
        {
            System.out.println ("The value: " + searchNum + " was not found.");
        }
        else
        {
            System.out.println ("An occurrence of: " + searchNum + " is at index: " + whereFound);
        } //end if




    } //main


    public static int myBinarySearch (int[] array, int key)
    {

        int middle; //element in physical 'center' of array
        int lowIndex; //Leftmost index of a subarray
        int highIndex; //Rightmost index of subarray

        //First time running
        lowIndex = 0;
        highIndex = array.length - 1;

        do
        {
            //Get the element in the physical 'center'
            middle =  (int)(lowIndex + highIndex) / 2;

            if (key == array [middle])
            {
                //Found it!
                return middle;
            }
            else if (key > array [middle])  //Left side of array does
            { //NOT hold the number
                lowIndex = middle + 1;
                //key must be on RIGHT side of middle
            }
            //Right side of array does NOT hold the number
            //Key must be on LEFT side
            else if (key < array [middle])
            {
                highIndex = middle - 1;
            }//end if

            //With low continually getting higher and
            //high continually getting lower in value
            //they eventually 'cross'
            //Number is not in list then
            if (lowIndex > highIndex)
            {
                return (-1);
            }
        }
        while (true);  //INFINITE LOOP!!!



    } //myBinarySearch
} //BinarySearchSample
