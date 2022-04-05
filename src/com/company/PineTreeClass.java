package com.company;

import java.util.Scanner;

public class PineTreeClass {
    public static void main(String[] args) {
        //Task 4
        System.out.println("Below is presented a pine tree solution");
        System.out.println("   *  ");
        System.out.println("  ***  ");
        System.out.println(" ***** ");
        System.out.println("*******");

        System.out.println("Below is 'beautified' version of Task 4 - a pine tree drawing");
        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Please enter your pine tree longest side count of symbols");
        int longSideA = myObj1.nextInt();
        System.out.println("Below is your pine tree drawing");

        if(longSideA>1){
            for(int i=0; i<longSideA;i++){
                for(int j=0; j<=i+1;j++){
                    if(j<longSideA-i&j<longSideA-1){
                        System.out.print(" ");
                    }
                    if(j<i+1){
                    System.out.print("*");

                }

                if(j==i){
                    System.out.println();

                }

                }
                }

            }

    }
}
