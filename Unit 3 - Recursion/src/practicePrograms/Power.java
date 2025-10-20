package practicePrograms;

public class Power {

    public static void main(String [] args) {

        System.out.println(calculatePower(2, 4));

    }

    public static int calculatePower(int n1, int n2) {

        int n3;

        if (n2 == 1)

            n3 = n1;

        else {
            n3 = n1 * calculatePower(n1, n2 - 1);
        }

        return n3;

    }

}
