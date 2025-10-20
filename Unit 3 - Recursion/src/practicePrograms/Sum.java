package practicePrograms;

public class Sum {

    public static void main(String [] args) {

        System.out.println(calculateSum(4));

    }


    public static int calculateSum(int n) {

        int sum;

        if (n == 1)
            sum = n;
        else
            sum = n + calculateSum(n - 1);

        return sum;

    }

}
