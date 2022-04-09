package com.operatorsHomework;

import java.util.Scanner;

public class eligibleToWork {
    public static void main(String[] args) {
        //Below is the task for checking if the person is eligible to work
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        String age = myScanner.nextLine();

        int ageToInt = 0;

        boolean isValid = true;
        Object ageObj = age;
        try {
            ageToInt = Integer.parseInt(age);
        } catch (NumberFormatException e) {
            isValid = false;
        }

        if(isValid){
            if(ageToInt>=16){
                System.out.println("You are eligible to work.");
        }
            else{
                System.out.println("You are NOT eligible to work.");
            }
        }
    }
}
