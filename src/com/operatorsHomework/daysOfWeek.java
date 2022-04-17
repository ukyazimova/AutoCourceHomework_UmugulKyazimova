package com.operatorsHomework;

import java.util.Scanner;

public class daysOfWeek {

    public static void main(String[] args) {
        //Below is the task presenting the day of the week by input 1-7
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a digit equal to 1-7 to see the day of the week");
        //int dayOfTheWeekDigit = myScanner.nextInt();
        String dayOfTheWeekDigit = myScanner.nextLine();

        String dayEnding = "th";
        String dayOfTheWeek = "";
        int dayOfTheWeekDigitToInt = 0;

        boolean isValidDay = true;
        try {
            dayOfTheWeekDigitToInt = Integer.parseInt(dayOfTheWeekDigit);
        } catch (NumberFormatException e) {
            isValidDay = false;
        }

        if(isValidDay){
            switch (dayOfTheWeekDigitToInt) {
                case 1 -> {
                    dayEnding = "st";
                    dayOfTheWeek = "Monday";
                }
                case 2 -> {
                    dayEnding = "nd";
                    dayOfTheWeek = "Tuesday";
                }
                case 3 -> {
                    dayEnding = "rd";
                    dayOfTheWeek = "Wednesday";
                }
                case 4 -> dayOfTheWeek = "Thursday";
                case 5 -> dayOfTheWeek = "Friday";
                case 6 -> dayOfTheWeek = "Saturday";
                case 7 -> dayOfTheWeek = "Sunday";
                default -> {
                    isValidDay = false;
                    System.out.println("The input is NOT associated to a day of the week! Please input a valid digit 1-7.");
                }
            }

            if(isValidDay){
                System.out.println("The "+dayOfTheWeekDigit+dayEnding+" day of the week is: "+dayOfTheWeek+".");
            }
        }
        else {
            System.out.println("The input is ONLY digits.");
        }


    }
}
