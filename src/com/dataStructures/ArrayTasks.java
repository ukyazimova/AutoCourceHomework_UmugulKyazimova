package com.dataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTasks {
    public static void main(String[] args) {
        //Below is task 1 - Write program to print sum of a given array elements
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your array length");
        String arrLengthValue = myScanner.nextLine();
        boolean isValidArrLength = true;
        boolean isValidArrIndexValue = true;
        int sumOfArrayElements =0;
        int arrLengthValueToInt = 0;

        try {
            arrLengthValueToInt = Integer.parseInt(arrLengthValue);
        } catch (NumberFormatException e) {
            isValidArrLength = false;
        }
        int[] arr = new int[arrLengthValueToInt];

        if(isValidArrLength){

            for (int i=0; i<arrLengthValueToInt; i++){
                System.out.println("Please enter your array "+i+" index value.");
                String arrIndexValue = myScanner.nextLine();

                int arrIndexValueToInt = 0;
                try {
                    arrIndexValueToInt = Integer.parseInt(arrIndexValue);
                } catch (NumberFormatException e) {
                    isValidArrIndexValue = false;
                }

                if(isValidArrIndexValue){
                    System.out.println("Array element at index "+i+" is: "+arrIndexValue);
                    arr[i]=arrIndexValueToInt;
                    sumOfArrayElements =sumOfArrayElements+ arr[i];

                }
            }
        }
        System.out.println("The array that you have entered is: "+ Arrays.toString(arr));
        System.out.println("The sum of Array Elements is equal to: "+sumOfArrayElements);

//Below is solution of Task 4 -> Find the biggest element of an array and print it in the console
        int biggestArrIndexValue=0;
        for(int j=0; j< arrLengthValueToInt-1; j++){
            if(arr[j]>arr[j+1]&& arr[j]>=biggestArrIndexValue){
                biggestArrIndexValue=arr[j];
            }

        }
        System.out.println("The entered arrays biggest index value is: "+biggestArrIndexValue);
    }
}
