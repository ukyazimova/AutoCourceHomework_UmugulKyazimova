package com.methods;

public class digitOperationsMethod {
 //Below is Task 1 of Methods Lecture -> Write a Java method to find the smallest number among three numbers
    static void smallestNumber(int numberA, int numberB, int numberC){
        int smallestNumber = 0;

        smallestNumber = ((numberA > numberB) && (numberA>smallestNumber) ? numberB : numberA);
        smallestNumber = ((numberA > numberC) && (numberA>smallestNumber) ? numberC : numberA);
        smallestNumber = ((numberB > numberA) && (numberB>smallestNumber) ? numberA : numberB);
        smallestNumber = ((numberB > numberC) && (numberB>smallestNumber) ? numberC : numberB);
        smallestNumber = ((numberC > numberA) && (numberC>smallestNumber) ? numberA : numberC);
        smallestNumber = ((numberC > numberB) && (numberC>smallestNumber) ? numberB : numberC);

        System.out.println("The smallest number among three given is: " + smallestNumber);

    }
    //Below is Task 2 of Methods Lecture -> Write a Java method to compute the average of three numbers.

    static void averageValue(int numberA, int numberB, int numberC){

        System.out.println("The value of given three numbers is equal to: ("+numberA +" + "+numberB +" + " + numberC+")/3 = " + ((numberA+numberB+numberC)/3));

    }

    //Below is Task 4 of Methods Lecture ->  Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise.

    static void isEven(int evenNumber){
        if (evenNumber %2==0) {
            System.out.println("The value of given int : "+evenNumber +" is even");
        }
        else {
            System.out.println("The value of given int : "+evenNumber +" is NOT even");

        }
    }

    public static void main(String[] args) {
        smallestNumber(3, 8,1);
        smallestNumber(9, 2,11);
        averageValue(9, 2,11);
        isEven(4);
        isEven(5);

    }
}
