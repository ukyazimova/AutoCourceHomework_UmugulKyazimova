package com.company;


import java.util.Scanner;

public class TriangleTasksClass {
    public static void main(String[] args) {
//Task 2
        System.out.println("Below is Task 2 for the 'hardcoded' triangle perimeter");
        int sideA = 5;
        int sideB = 5;
        int sideC = 5;

        int perimeter = sideA+sideB+sideC;
        System.out.println("The 1st side of triangle is: "+ sideA +"cm long");
        System.out.println("The 2nd side of triangle is: "+ sideB +"cm long");
        System.out.println("The 3rd side of triangle is: "+ sideC +"cm long");
        System.out.println("The triangle perimeter is equal to: "+sideA+"+"+sideB+"+"+sideC+"="+perimeter);

 //Task 5a
        System.out.println("Below is 'beautified' version of Task 2 calculating a triangle perimeter");
        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Please enter your triangle sideA length");
        int sideA1 = myObj1.nextInt();
        System.out.println("Please enter your triangle sideB length");
        int sideB1 = myObj1.nextInt();
        System.out.println("Please enter your triangle sideC length");
        int sideC1 = myObj1.nextInt();
        System.out.println("The triangle perimeter is equal to: "+sideA1+"+"+sideB1+"+"+sideC1+"="+((sideA1+sideB1)+sideC1));

//Task 5b
        System.out.println("Below is 'beautified' version of Task 2 calculating a triangle perimeter");
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Please enter your triangle base length");
        int sideA2 = myObj2.nextInt();
        System.out.println("Please enter your triangle height length");
        int sideB2 = myObj1.nextInt();
        System.out.println("The triangle area is equal to: ("+sideA2+"*"+sideB2+")/2="+((sideA2*sideB2)/2));
    }
}
