package golf;

public class PlayGolfClient {

    public static void main(String[] args) {

        GolfClub golfClub = new GolfClub("putter");
        System.out.println(golfClub);
        System.out.println(golfClub.swing(2));


    }

}
