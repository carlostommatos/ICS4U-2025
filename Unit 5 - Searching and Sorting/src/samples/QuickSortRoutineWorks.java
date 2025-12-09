package samples;

public class QuickSortRoutineWorks  //Array Class
{
    public static void main (String[] args)
    {
        //Array of numbers
	/*int[] nums = new int [20];

	for (int i = 0 ; i < nums.length ; i++)
	    nums [i] = (int) (Math.random () * (100 - 1) + 1);
	    */
        int [] nums = {1, 4, 5, 9, 7, 2, 3, 9, 10};

        System.out.println ("");
        System.out.println ("Display of the Unsorted Array");
        System.out.println ("=============================");
        displayArray (nums);

        //******************************************
        //Call on the quicksort to sort from low to high
        //Send the array, the lowest index and the highest index

        quickSort (nums);

        //******************************************

        System.out.println ("");
        System.out.println ("Display of the Sorted Array");
        System.out.println ("=============================");
        displayArray (nums);

    } //main method


    //Primary call - the user would naturally call a sort and provide just the array to be sorted
    // Yet quickSort also needs the low and high indices
    // But we shouldn't bother the user with providing these because it doesn't seem user-friendly
    public static void quickSort (int arr[])
    {
        int lowIndex = 0;
        int highIndex = arr.length - 1;

        //Perform secondary call, sending info that quickSort needs
        quickSort (arr, lowIndex, highIndex);

    }


    //Secondary overloaded call - quickSort actually needs 3 arguments to work:
    //      ~ the array to be sorted
    //      ~ the lowest index of the portion of the array being sorted
    //      ~ the highest index of the portion of the array being sorted
    public static void quickSort (int arr[], int lowIndex, int highIndex)
    {

        //Establish far left and far right indices in the portion of the array that
        //we are dealing with
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        //Select the pivot or partition element
        //In this case we pick the element located midway between the lowIndex and highIndex
        int pivotIndex = (int) (lowIndex + highIndex) / 2;
        int pivotValue = arr [pivotIndex]; //******** THE ACTUAL PIVOT ELEMENT

        do
        {
            //Keep the left pointer moving inward until we have an element
            //that is not on the correct side of the pivot element
            while (arr [leftPointer] < pivotValue)
                leftPointer++;

            //Keep the right pointer moving inward until we have an element
            //that is not on the correct side of the pivot element
            while (arr [rightPointer] > pivotValue)
                rightPointer--;

            //Make sure the left pointer did not cross over the right pointer
            //If all is fine, swap the element at the left pointer with the element
            //on the right pointer
            if (leftPointer <= rightPointer)
            {
                //Swap elements
                int temp = arr [leftPointer];
                arr [leftPointer] = arr [rightPointer];
                arr [rightPointer] = temp;

                //Move pointers inward
                leftPointer++;
                rightPointer--;
            }
        }
        while (leftPointer < rightPointer); //Keep moving pointers as long as they don't cross over

        // ****  At this point, the pivot is in the right location!

        //RECURSIVE CALL
        //Call quickSort again sending the left partition
        if (lowIndex < rightPointer)
            quickSort (arr, lowIndex, rightPointer);

        //Call quickSort again sending the left partition
        if (leftPointer < highIndex)
            quickSort (arr, leftPointer, highIndex);
    }





    public static void displayArray (int[] n)
    {
        for (int x = 0 ; x < n.length ; x++)
        {
            System.out.print (n [x] + "\t");
        }


        System.out.println ("");
    }
}