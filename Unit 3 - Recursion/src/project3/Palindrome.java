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

        // clean up the string by removing spaces
        // and setting all letters to lower case
        word = word.toLowerCase();
        word = word.replace(" ", "");

        // if any of the letters are not the same, the word is not a palindrome
        if (word.charAt(0) != word.charAt(word.length() - 1))
            return false;

        // if the middle two letters are the same (0 letters left)
        // or there is only one letter left, the word is a palindrome
        else if (word.length() <2)
            return true;

        // move on to the next letter of the word
        String shortenedWord = word.substring(1, word.length() - 1);
        return isPalindrome(shortenedWord);

    }



}
