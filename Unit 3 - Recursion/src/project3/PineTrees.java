package project3;

public class PineTrees {

    public static void main(String [] args) {

        System.out.println(trees(7000, 10));
        double trees = 7000;

        System.out.println(trees);


    }

    public static double trees(double treesOwned, int years) {

        if (years == 0)
            return treesOwned;

        else
            treesOwned = trees(treesOwned * 0.88 + 600, years - 1);

        return treesOwned;

    }
}
