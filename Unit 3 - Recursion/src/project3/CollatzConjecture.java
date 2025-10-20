package project3;


/*
CollatzConjecture
no matter what number you start with, you will end with 1
Carlos Matos
Monday, October 20, 2025
 */
public class CollatzConjecture {

    public static void main(String [] args) {

        collatz(8);

    }

    public static void collatz(int n) {

        // if the number is one, stop the program
        if (n == 1)
            System.out.println(n);
        else {
            System.out.print(n + " ");

            if (n % 2 == 0) // if the number is even
                n /= 2;
            else // if the number is odd
                n = n * 3 + 1;
            collatz(n);

        }

    }

}