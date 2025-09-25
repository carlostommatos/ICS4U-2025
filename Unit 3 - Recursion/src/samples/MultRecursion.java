package samples;

public class MultRecursion {

    public static void main(String [] args) {

        int num1, num2, ans;

        num1 = 7;
        num2 = 5;

        // Now find the product by calling
        // on a recursive method (function-type)
        ans = multiR(num1, num2);
        System.out.println("The product is: " + ans);

    } // main method

    // 7, 5   -->   7 + 7, 4   -->   7 + 7, 3   ... etc.
    public static int multiR(int n1, int n2) {

        int prod;

        // check for breakpoint
        if (n2 == 1)
            prod = n1; // where we stop recursive calls
        else
            // calling the method again
            // with a smaller, identical problem
            prod = n1 + multiR(n1, n2 - 1);

        return prod;

    }

}
