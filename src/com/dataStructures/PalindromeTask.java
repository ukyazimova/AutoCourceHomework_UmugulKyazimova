package com.dataStructures;

import java.util.Scanner;

public class PalindromeTask {
    public static void main(String[] args) {
// Below is the solution of Task7 ->  Write a program which validate whether given string is palindrome (A palindrome is a sequence of characters which reads the same backward as forward, such as madam or racecar)
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your word for checking if the word is a palindrome");
        String palindromeWord = myScanner.nextLine();
        StringBuilder reversedPalindromeWord = new StringBuilder();

            for (int j = palindromeWord.length() - 1; j >= 0; j--) {
                reversedPalindromeWord.append(palindromeWord.charAt(j));
        }
      //  System.out.println("reversedPalindromeWord is: " + reversedPalindromeWord);

    if(palindromeWord.equals(reversedPalindromeWord.toString()))
    {
        System.out.println(palindromeWord + " is a palindrome");
    }
    if(!palindromeWord.equals(reversedPalindromeWord.toString()))
    {
        System.out.println(palindromeWord + " is NOT a palindrome");
    }
}
}
