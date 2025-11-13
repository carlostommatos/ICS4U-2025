package arrays;

/*
fFactorFun
various methods to manipulate an array of factors
Carlos Matos
Tuesday, October 28, 2025
 */

import java.util.ArrayList;

public class FactorFun {

    public static void main(String [] args) {

        // create a 2d array to hold the factors of each number from 1-1000
        // an array list of an array list makes it so that I can use jagged arrays
        ArrayList<ArrayList<Integer>> factorArray = new ArrayList <ArrayList<Integer>>(1000);

        // fill the array with all of the factors
        for (int i = 1; i < 1000 + 1; i++) { // + 1 because
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

        System.out.println("The factors of all the numbers from 1 to " + factorArray.size());
        System.out.println(factorArray + "\n");

        System.out.println("The numbers with the most factors from 1 to " + factorArray.size());
        System.out.println(mostFactors(factorArray) + "\n");

        System.out.println("The prime numbers from 1 to " + factorArray.size());
        System.out.println(primeNumbers(factorArray) + "\n");

        System.out.println("Is 28 a perfect number?");
        System.out.println(perfectNumber(28, factorArray));
        System.out.println("Is 29 a perfect number?");
        System.out.println(perfectNumber(29, factorArray));

    } // main method




    // scans the 2d factor array to find the numbers with the most factors
    public static ArrayList<Integer> mostFactors(ArrayList<ArrayList<Integer>> factorArray) {

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
    public static ArrayList<Integer> primeNumbers(ArrayList<ArrayList<Integer>> factorArray) {

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
    public static boolean perfectNumber(int number, ArrayList<ArrayList<Integer>> factorArray) {

        int sum = 0;
        for (int i = 0; i < (factorArray.get(number - 1).size()) - 1; i++)
            sum = sum + factorArray.get(number - 1).get(i);

        // if the sum is equal to the number, the number is perfect
        if (sum == factorArray.get(number - 1).get(factorArray.get(number - 1).size() - 1))
            return true;
        else
            return false;

    } // perfectNumber method


} // FactorFun class
