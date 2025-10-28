package project4;


import java.util.Scanner;

public class PennyPitch {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in); // scanner to record whether the user wants to play again



        // 1. INITIALIZE THE 5X5 GAME BOARD WITH 
        //    5 RANDOM PRIZES APPEARING IN THREE DIFFERENT ELEMENTS


        // create a 5x5 grid for the game board
        int [] [] board = new int [5] [5];
        // 5 prizes from 1-5
        // 0 means empty
        // all elements are 0 by default

//        // print the game board
//        for (int r = 0 ; r < board.length ; r++)
//        {
//            for (int c = 0 ; c < board[r].length ; c++)
//            {
//                System.out.print (board [r] [c] + "\t");
//            } //columns
//            System.out.println();
//        } //rows

        // variables for the row and column for adding a prize
        int row;
        int column;


        for (int i = 1; i < 6; i++) { // prizes are 1 to 5 because 0 is an empty square
            for (int n = 0; n < 3; n++) { // repeats 3 times for each prize

                do {
                    // get a random spot on the board
                    row = (int) (Math.random() * (5));
                    column = (int) (Math.random() * (5));
                }

                // if the spot already has a prize, find a new spot
                while (board [row] [column] != 0);

                // add the prize to the empty spot
                board[row][column] = i;

            } // n for loop
        } // i for loop


        // 5. LOOP THE GAME AS LONG AS THE USER WANTS TO PLAY AGAIN
        //    CLEAR THE PENNIES BUT KEEP 
        boolean playAgain = true;

        do {
            // 2. DISPLAY THE GAME BOARD SO THE PLAYER
            //    CAN SEE THE PRIZES THEY CAN WIN

            // print the board array
            System.out.println();
            for (int r = 0; r < board.length; r++) {
                for (int c = 0; c < board[r].length; c++) {
                    System.out.print(board[r][c] + "\t");
                } //columns
                System.out.println();
            } //rows
            System.out.println();


            // 3. LET THE PLAYER THROW 10 PENNIES AT THE BOARD

            // create a duplicate board for the pennies to be thrown on
            // so that the original can be used if the player wants to play again
            int[][] pennyBoard = new int[5][5];

            for (int i = 0; i < 5; i++) { // rows
                for (int n = 0; n < 5; n++) // columns
                    pennyBoard[i][n] = board[i][n];
            } // i for loop

            // throw ten pennies at the board.
            // it's okay for the penny to land on the same spot twice

            // reuse the variables from the prizes
            row = 0;
            column = 0;

            for (int i = 0; i < 10; i++) { // throw ten times

                // get a random square for the penny to land
                row = (int) (Math.random() * (5));
                column = (int) (Math.random() * (5));

                // a 7 indicates where a penny has landed
                pennyBoard[row][column] = 7;
            }

            // print the board array with the pennies
            System.out.println();
            for (int r = 0; r < pennyBoard.length; r++) {
                for (int c = 0; c < pennyBoard[r].length; c++) {
                    System.out.print(board[r][c] + "\t");
                } //columns
                System.out.println();
            } //rows


            // 4. LET THE PLAYER KNOW IF THEY HAVE WON A PRIZE

            // tracks whether each prize is won.
            // since prize 0 is a blank spot, it's always false
            // in the next for loops, the prize will be made false if
            // one of the spots is not covered by a penny
            boolean[] prizeWon = {false, true, true, true, true, true};

            for (int i = 0; i < 5; i++) {
                for (int n = 0; n < 5; n++) {
                    for (int x = 1; x < 6; x++) {

                        // if at least one spot of the prize is not covered,
                        // the prize is not won
                        if (pennyBoard[i][n] == x) {
                            prizeWon[x] = false;
                            break; // only one prize per spot, check the next one
                        }

                    } // x for loop=
                } // n for loop
            } // i for loop


            // print whatever prizes were won
            // only repeats from prizes 1-5 because 0 is always false
            System.out.println();
            for (int i = 1; i < 6; i++)
                if (prizeWon[i])
                    System.out.println("You won prize: " + i);
            System.out.println();

            System.out.println("Would you like to play again? (Y/N)");
            // takes the first letter of what the user says and converts to uppercase
            // for example, yes, Yes, y, Y would work
            char YN = Character.toUpperCase(sc.next().charAt(0));

            // make playAgain match whether the user wants to play again
            switch (YN) {
                case ('Y'): // keep here for clarity
                    playAgain = true;
                case ('N'):
                    playAgain = false;
            }

        } // do loop

        while (playAgain); // restart the game if the user wants to play again

    } // main method

} // PennyPitch class
