package project3;

import java.util.Scanner;

public class Palindrome {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: "); // gets a word from the user to check if palindrome
        String word = sc.nextLine();
        System.out.println(isPalindrome(word));
    }




    public static boolean isPalindrome(String word) {

        word = word.toLowerCase();
        word = word.replace(" ", "");
        char [] word2 = word.toCharArray();
        String prod;
        boolean tf = true;

        if (word2 [0] != word2 [word2.length - 1]) {
            System.out.println("I'm here");
            tf = false;

        }


        else {

            word2 [0] = ' ';
            word2 [word2.length - 1] = ' ';
            prod = new String(word2);
            prod = prod.replace(" ", "");
            prod = prod.trim();
            System.out.println(prod);
            isPalindrome(prod);

        }

        return tf;
    }





    // make a variable for wordlength and another for what should change
//    public static boolean isPalindrome(String word, int n) {
//
//        word = word.replace(" ", "");
//        word = word.toLowerCase();
//        System.out.println("n: " + n);
//        if (word.length() - n < word.length() / 2)
//            return true;
//
//        System.out.println(word.charAt(word.length() - 1 - n));
//        System.out.println(word.charAt(n));
//
//        if (word.charAt(word.length() - n - 1) == word.charAt(n))
//            return isPalindrome(word, n + 1);
//
//        return false;
//
//
//
//    }





//    public static boolean isPalindrome(String word1, int n) {
//
//
//        String word2 = word1.replace(" ", ""); // removes spaces from the word
//        word2 = word2.toLowerCase(); // makes all of the letters lowercase
//
//
//        // base case: if every letter past the halfway point is the same,
//        // the word is a palindrome
//        if (n <= word2.length() / 2) {
//
//            return true;
//
//        }
//
//        if (word2.charAt(n - 1) == word2.charAt(word2.length() - n)) {
//
//            return isPalindrome(word2, n - 1);
//
//        }
//
//
//
//        return false;
//
//    }



}
