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
        String dayOfTheWeek = new String();
        int dayOfTheWeekDigitToInt = 0;

        boolean isValidDay = true;
        Object dayDigitObj = dayOfTheWeekDigit;
        try {
            dayOfTheWeekDigitToInt = Integer.parseInt(dayOfTheWeekDigit);
        } catch (NumberFormatException e) {
            isValidDay = false;
        }

        if(isValidDay){
            switch (dayOfTheWeekDigitToInt){
                case 1:
                    dayEnding = "st";
                    dayOfTheWeek = "Monday";
                    break;
                case 2:
                    dayEnding = "nd";
                    dayOfTheWeek = "Tuesday";
                    break;
                case 3:
                    dayEnding = "rd";
                    dayOfTheWeek = "Wednesday";
                    break;
                case 4:
                    dayOfTheWeek = "Thursday";
                    break;
                case 5:
                    dayOfTheWeek = "Friday";
                    break;
                case 6:
                    dayOfTheWeek = "Saturday";
                    break;
                case 7:
                    dayOfTheWeek = "Sunday";
                    break;
                default:
                    isValidDay=false;
                    System.out.println("The input is NOT associated to a day of the week! Please input a valid digit 1-7.");
                    break;
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
