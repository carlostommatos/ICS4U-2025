package project3;

public class CollatzConjecture {

    public static void main(String [] args) {

        collatz(8);

    }

    public static void collatz(int n) {


        if (n == 1)
            System.out.println(n);
        else {
            System.out.print(n + " ");

            if (n % 2 == 0)
                n /= 2;
            else
                n = n * 3 + 1;
            collatz(n);

        }



    }


}