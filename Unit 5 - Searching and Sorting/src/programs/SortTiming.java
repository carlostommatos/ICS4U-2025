package programs;

import samples.BinarySearchSampleInClass;
import samples.InsertionSortSimple;
import samples.QuickSortRoutineWorks;

import java.util.Arrays;

public class SortTiming {

    public static void main(String [] args) {

        int length = 50000;
        int [] numbers = new int[length];

        for (int i = 0; i < length; i++)
            numbers[i] = (int) (Math.random() * (10000 - -10000) - 10000);



        //  A)  Sort the original array of random numbers.
        //      See how long a general sort takes.
        System.out.println("A) Sort the original array of random numbers: \n");


        // QuickSort
        int [] quickSortNumbers = numbers.clone();
        double time = System.nanoTime();
        quickSort(quickSortNumbers);
        time = (System.nanoTime() - time) / Math.pow(10, 9);
        System.out.println("QuickSort time in seconds: " + time + "s");

        // InsertionSort
        int [] insertionSortNumbers = numbers.clone();
        time = System.nanoTime();
        insertionSort(insertionSortNumbers);
        time = (System.nanoTime() - time) / Math.pow(10, 9);
        System.out.println("InsertionSort time in seconds: " + time + "s");

        // BubbleSort
        int [] bubbleSortNumbers = numbers.clone();
        time = System.nanoTime();
        bubbleSort(bubbleSortNumbers);
        time = (System.nanoTime() - time) / Math.pow(10, 9);
        System.out.println("BubbleSort time in seconds: " + time + "s");


        System.out.println();



        //  B)  Sort the already sorted array in opposite order.
        //      See how long a "worst-case scenario" takes to sort.



        //  C)  Sort an already sorted array in the same order again.
        //      See how long it takes to run through a sort routine
        //      when no actual sorting takes place.


        System.out.println("C) Sort an already sorted array in the same order again: \n");


        // QuickSort
        time = System.nanoTime();
        quickSort(quickSortNumbers);
        time = (System.nanoTime() - time) / Math.pow(10, 9);
        System.out.println("QuickSort time in seconds: " + time + "s");

        // InsertionSort
        time = System.nanoTime();
        insertionSort(insertionSortNumbers);
        time = (System.nanoTime() - time) / Math.pow(10, 9);
        System.out.println("InsertionSort time in seconds: " + time + "s");

        // BubbleSort
        time = System.nanoTime();
        bubbleSort(bubbleSortNumbers);
        time = (System.nanoTime() - time) / Math.pow(10, 9);
        System.out.println("BubbleSort time in seconds: " + time + "s");



        //  D)  Swap the first element of a sorted array with
        //      the last element and run it through a sort again.
        //      See how long it takes to sort with
        //      one element of out of order.




    }



    // QuickSort 

    // primary call
    public static void quickSort (int arr[]) {
        int lowIndex = 0;
        int highIndex = arr.length - 1;
        quickSort (arr, lowIndex, highIndex); // secondary call
    } // primary call

    // secondary call
    public static void quickSort (int arr[], int lowIndex, int highIndex) {

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        int pivotIndex = (int) (lowIndex + highIndex) / 2;
        int pivotValue = arr [pivotIndex];

        do {

            while (arr [leftPointer] < pivotValue)
                leftPointer++;

            while (arr [rightPointer] > pivotValue)
                rightPointer--;

            if (leftPointer <= rightPointer) {
                int temp = arr [leftPointer];
                arr [leftPointer] = arr [rightPointer];
                arr [rightPointer] = temp;

                leftPointer++;
                rightPointer--;
            } // if statement

        } // do while loop
        while (leftPointer < rightPointer);

        if (lowIndex < rightPointer) // recursive call
            quickSort (arr, lowIndex, rightPointer);

        if (leftPointer < highIndex)
            quickSort (arr, leftPointer, highIndex);
    } // secondary call



    // InsertionSort

    // insertionSort method
    public static void insertionSort(int arr[]) {

        int temp;

        for (int indexKey = 1 ; indexKey < arr.length ; indexKey++) {

            if ((arr [indexKey] < arr [indexKey - 1]) && (indexKey > 0)) {

                temp = arr [indexKey];
                int rightLoc = indexKey - 1;

                while (temp < arr [rightLoc]) {
                    rightLoc--;
                    if (rightLoc == -1)
                        break;
                } // while loop

                rightLoc++;
                shift (arr, rightLoc, indexKey);

            } // if statement


        } // for loop

    } // insertionSort method


    // shift method
    public static void shift (int[] list, int newIndex, int oldIndex) {
        int temp = list [oldIndex];

        for (int x = oldIndex ; x > newIndex ; x--)
            list [x] = list [x - 1];

        list [newIndex] = temp;
    } // shift method


    
    // BubbleSort
    public static void bubbleSort(int [] arr) {
        
        int temp;
        boolean swap;

        do {
            swap = false;

            for (int i = 0 ; i < arr.length - 1 ; i++) {

                if (arr [i] > arr [i + 1]) {

                    temp = arr [i];
                    arr [i] = arr [i + 1];
                    arr [i + 1] = temp;

                    swap = true;

                } // if statement
            } // for loop
        } // do while loop

        while (swap == true);

    } // bubbleSort method
    
    
    
} // SortTiming class
