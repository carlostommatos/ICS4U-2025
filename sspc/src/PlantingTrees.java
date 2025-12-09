import java.util.HashSet;
import java.util.Scanner;

public class PlantingTrees  {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int tripDescriptions = sc.nextInt();
            HashSet<String> distinctTrips = new HashSet<>();

            for (int j = 0; j < tripDescriptions; j++) {
                distinctTrips.add(sc.next());
            }

            System.out.println(distinctTrips.size());
        }


    }
}
