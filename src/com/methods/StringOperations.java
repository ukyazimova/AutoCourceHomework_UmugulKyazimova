package com.methods;

import java.util.Scanner;

public class StringOperations {

    //Below is Task 3 of Methods Lecture -> Write a Java method to display the middle character of a string.
    static void middleChar(String word){
        String string1 = "";
        if (word.length()%2!=0) {
            System.out.println("The middle character of the given string "+word +" is: "+word.charAt(word.length()/2));

        }
        if (word.length()%2==0) {
            System.out.println("The middle character of the given string "+word +" is: "+word.charAt(word.length()/2)+""+word.charAt(word.length()/2-1));
        }
    }

    //Below is Task 5 of Methods Lecture -> A takes as input a non-negative integer and returns true if the number is a palindrome;
   // Non-negative integer is called a palindrome if it reads forward and backward in the same way. For example, the numbers 5, 121, 3443, and 123454321 are palindromes.
    static void palindromeNumber(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your word for checking if the word is a palindrome");
        String palindromeWord = myScanner.nextLine();
        boolean isValid = true;

        try {
            Integer.parseInt(palindromeWord);
        } catch (NumberFormatException e) {
            isValid = false;
        }


        StringBuilder reversedPalindromeWord = new StringBuilder();
        if(isValid){
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
    public static void main(String[] args) {
        middleChar("middle");
        middleChar("audio");
        palindromeNumber();
        palindromeNumber();
    }
}
