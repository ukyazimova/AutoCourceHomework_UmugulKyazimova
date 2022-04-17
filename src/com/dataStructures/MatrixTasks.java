package com.dataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixTasks {
    public static void main(String[] args) {

        // Below is the solution of Task2 -> Print elements of a given 2-d matrix with 4 rows and 3 columns
        int[][] arr = new int[4][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;
        arr[3][0] = 10;
        arr[3][1] = 11;
        arr[3][2] = 12;
        System.out.println("The given array is: ");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

// Below is the solution of Task3 -> Print elements of a given 2-d matrix with dynamic rows and columns taken from user input
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your array count of rows");
        int arrRowsValue = myScanner.nextInt();
        System.out.println("Please enter your array count of columns");
        int arrColumnsValue = myScanner.nextInt();
        int[][] dynArr = new int[arrRowsValue][arrColumnsValue];

        for (int i = 0; i < arrRowsValue; i++) {
            for (int j = 0; j < dynArr[i].length; j++) {
                System.out.println("Please enter your next value.");
                dynArr[i][j] = myScanner.nextInt();

            }
        }
        System.out.println("The array that you have entered is: ");
        for (int i = 0; i < arrRowsValue; i++) {
            for (int j = 0; j < arrColumnsValue; j++) {
                System.out.print(dynArr[i][j] + " ");
            }
            System.out.println();
        }

// Below is the solution of Task6 -> Find sum of the diagonal of a given 2d matrix with 4 rows and 4 columns
        int[][] sumArr = new int[4][4];
        sumArr[0][0] = 1;
        sumArr[0][1] = 2;
        sumArr[0][2] = 3;
        sumArr[0][3] = 4;
        sumArr[1][0] = 5;
        sumArr[1][1] = 6;
        sumArr[1][2] = 7;
        sumArr[1][3] = 8;
        sumArr[2][0] = 9;
        sumArr[2][1] = 10;
        sumArr[2][2] = 11;
        sumArr[2][3] = 12;
        sumArr[3][0] = 13;
        sumArr[3][1] = 14;
        sumArr[3][2] = 15;
        sumArr[3][3] = 15;


        System.out.println("The array that you have entered is: ");
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(sumArr[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("The given array sum of the diagonal is equal to : ");
int sumDiagonal =0;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if((i==0&&j==0)||(i==1&&j==1)||(i==2&&j==2)||(i==3&&j==3)){
                    sumDiagonal= sumDiagonal+sumArr[i][j];
                    if(i == 0 || i == 1 || i == 2) {
                        System.out.print(sumArr[i][j] + " + ");
                    }
                    if(i == 3) {
                        System.out.print(sumArr[i][j]);
                    }
                }

            }
        }
        System.out.println(" = " + sumDiagonal);

    }
}
