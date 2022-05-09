package com.constructorTasks;

import java.util.Scanner;

public class NumberDivision {
    public static String firstNumber;
    public static String secondNumber;

    public static void divisionMethod() {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        firstNumber = obj1.nextLine();
        Scanner obj2 = new Scanner(System.in);
        System.out.println("Enter the second number: ");
        secondNumber = obj2.nextLine();
        boolean isValid = true;

        try {
            Integer.parseInt(firstNumber);
            Integer.parseInt(secondNumber);
            if (Integer.parseInt(firstNumber) == 0 || Integer.parseInt(secondNumber) == 0) {
                System.out.println("Using 0 as value for division is not allowed!");
                isValid = false;
                divisionMethod();
            }

        } catch (NumberFormatException e) {
            isValid = false;

            divisionMethod();
        }

        if (isValid) {
            System.out.println("division is equal to: " + Integer.parseInt(firstNumber) + "/" + Integer.parseInt(secondNumber) + "=" + (Integer.parseInt(firstNumber) / Integer.parseInt(secondNumber)));
        }


    }

    public static void main(String[] args) {
        firstNumber = "";
        secondNumber = "";
        divisionMethod();
    }
}
