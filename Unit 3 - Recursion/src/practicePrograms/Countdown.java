package practicePrograms;

public class Countdown {

    public static void main(String [] args) {

        countDown(10);
    }

    public static int countDown(int number) {
        int n;
        if (number == -1) {
            n = number;
        }
        else {
            n = countDown(number - 1);
            System.out.print(9 - n + " ");

        }

        return number;

    }
}
