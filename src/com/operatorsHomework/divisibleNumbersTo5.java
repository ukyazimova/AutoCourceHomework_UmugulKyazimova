package com.operatorsHomework;

import java.util.ArrayList;
import java.util.List;

public class divisibleNumbersTo5 {
    public static void main(String[] args) {
        //Below is the task for finding all divisible to 5 numbers from the given list nd are less than 150.

        int[] list1 = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        List<Integer> divisibleTo5= new ArrayList<>();

        for (int j : list1) {
            if (j % 5 == 0 && j < 150) {
                divisibleTo5.add(j);

            }
        }
        System.out.println("The divisible to 5 numbers from the initial list {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200} and are less than 150 are: "+divisibleTo5);
    }
}
