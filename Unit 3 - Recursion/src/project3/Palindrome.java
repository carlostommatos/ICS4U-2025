package project3;

import java.util.Scanner;

public class Palindrome {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: "); // gets a word from the user to check if palindrome
        String word = sc.next();
        int wordLength = word.length(); // gets the word's length to use for the isPalindrome method
        System.out.println(isPalindrome(word, wordLength));

    }

    public static boolean isPalindrome(String word1, int n) {

        String word2 = word1.replace(" ", ""); // removes spaces from the word
        word2 = word2.toLowerCase(); // makes all of the letters lowercase
        // base case: if every letter past the halfway point is the same,
        // the word is a palindrome
        if (n <= word2.length() / 2) {

            return true;

        }

        if (word2.charAt(n - 1) == word2.charAt(word2.length() - n)) {

            return isPalindrome(word2, n - 1);

        }



        return false;

    }



}
