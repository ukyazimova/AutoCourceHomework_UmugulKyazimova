package com.operatorsHomework;

import java.util.Arrays;
import java.util.Scanner;

public class largestNumberOfArray {
    public static void main(String[] args) {
        //Below is the task for checking if the person is eligible to work
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your array length");
        String arrLengthValue = myScanner.nextLine();
        boolean isValidArrLength = true;
        boolean isValidArrIndexValue = true;

        int arrLengthValueToInt = 0;

        try {
            arrLengthValueToInt = Integer.parseInt(arrLengthValue);
        } catch (NumberFormatException e) {
            isValidArrLength = false;
        }
        int arr[] = new int[arrLengthValueToInt];

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
            }
        }
        }

        int biggestArrIndexValue=0;
        for(int j=0; j< arrLengthValueToInt-1; j++){
            if(arr[j]>arr[j+1]&& arr[j]>=biggestArrIndexValue){
                biggestArrIndexValue=arr[j];
            }

        }
        System.out.println("The array that you have entered is: "+ Arrays.toString(arr));
        System.out.println("The entered arrays biggest index value is: "+biggestArrIndexValue);


    }
}
