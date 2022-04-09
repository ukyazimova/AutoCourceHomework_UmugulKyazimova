package com.operatorsHomework;

import java.util.Scanner;

public class discountCalculation {

    public static void main(String[] args) {
        //Below is the task for discount calculation and revenue.
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your purchased quantity of products.");
        String quantityPurchased = myScanner.nextLine();
        double discountValue = 0;
        String discountPercentage = "0%";

        int quantityPurchasedToInt = 0;

        boolean isValid = true;

        try {
            quantityPurchasedToInt = Integer.parseInt(quantityPurchased);
        } catch (NumberFormatException e) {
            isValid = false;
        }

        if(isValid){
        if(quantityPurchasedToInt>=100 && quantityPurchasedToInt<=120) {
            discountValue=0.15;
            discountPercentage = "15%";
        }
            if(quantityPurchasedToInt>120) {
                discountValue=0.2;
                discountPercentage = "20%";
            }
            if(quantityPurchasedToInt<100) {

            }
            System.out.println("The unit price of the product is: 25");
            System.out.println("You have entered: "+quantityPurchasedToInt + " as quantity of products to purchase.");
            if(discountPercentage!="0%"){
                System.out.println("The discount per the purchased quantity is : "+discountPercentage);
                System.out.println("The revenue from sale would be equal to: "+(quantityPurchasedToInt*25)*discountValue + "$.");

            }
            else{
                System.out.println("You don't have discount applied for the purchased quantity of products.");
                System.out.println("The revenue from sale would be equal to: "+(quantityPurchasedToInt*25) + "$.");

            }

        }
        else {
            System.out.println("The input is ONLY digits.");
        }
    }
}
