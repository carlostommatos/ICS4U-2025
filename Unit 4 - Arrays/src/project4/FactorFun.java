package project4;

/*
FactorFun
various methods to manipulate an array of factors
Carlos Matos
Tuesday, October 28, 2025
 */

import java.util.ArrayList;

public class FactorFun {

    public static void main(String [] args) {

        // create a 2d array to hold the factors of each number from 1-1000
        // an array list of an array list makes it so that I can use jagged arrays
        ArrayList<ArrayList> factorArray = new ArrayList <ArrayList>(1000);

        // fill the array with all of the factors
        for (int i = 1; i < 1000; i++) {
            // a temp array to hold all of the factors of one number
            // resets each run of the i for loop
            ArrayList<Integer> factors = new ArrayList<Integer>();
            for (int n = 1; n < i + 1; n++) { // tests each value from 1 to the number
                if (i % n == 0) { // if the remainder is zero, n is a factor of i
                    factors.add(n);
                }
            } // n for loop
            factorArray.add(factors); // add the factors of i to the list of factors
        } // i for loop

    } // main method




    // scans the 2d factor array to find the numbers with the most factors
    public static ArrayList<Integer> mostFactors(ArrayList<ArrayList> factorArray) {

        // tracks the most amount of factors for all numbers
        int highestFactors = 0;

        for (int i = 0; i < factorArray.size(); i++) { // every number in the array

            // if a number has more factors than the current most, update it
            if (factorArray.get(i).size() > highestFactors)
                highestFactors = factorArray.get(i).size();
        } // i for loop

        // keeps track of all of the numbers with the most number of factors
        ArrayList<Integer> numberArray = new ArrayList<Integer>();

        for (int i = 0; i < factorArray.size(); i++) { // check every number again
            // if the number has the highest number of factors, add it to the list
            if (factorArray.get(i).size() == highestFactors)
                numberArray.add(i + 1);
        }

        return numberArray; // return the list of numbers with the most factors
    } // mostFactors method




    // scans the 2d array for all the prime numbers in the factor array
    public static ArrayList<Integer> primeNumbers(ArrayList<ArrayList> factorArray) {

        // list of all of the prime numbers
        ArrayList<Integer> primeArray = new ArrayList<Integer>();
        for (int i = 0; i < factorArray.size(); i++) { // checks every number in the array
            if (factorArray.get(i).size() < 3) // if the number has 1 or 2 factors, it is prime
                primeArray.add(i + 1); // i + 1 because the index is 1 less than the actual number
        }

        return primeArray; // return the array with all of the prime numbers
    } // primeNumbers method



    // allow the user to enter a number and check if it is a perfect number
    // a perfect number is when all the factors other than itself add up to the number
    public static boolean perfectNumber(int number) {

        // creates a list of all of the factors for the inputted number
        ArrayList<Integer> factors = new ArrayList<Integer>();

        // get all factors
        for (int i = 1; i < number - 1; i++) {
            if (number % i == 0)
                factors.add(i);
        }

        // variable to check the sum of the factors
        int sum = 0;

        // get the sum of the factors
        for (int i = 0; i < factors.size() - 1; i++)
            sum = sum + factors.get(i);

        // if the sum is equal to the number, the number is perfect
        if (sum == factors.get(factors.size() - 1))
            return true;

        else
            return false;

    } // perfect number

} // FactorFun class
