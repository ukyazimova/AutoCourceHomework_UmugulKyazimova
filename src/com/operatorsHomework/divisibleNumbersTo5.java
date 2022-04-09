package com.operatorsHomework;

import java.util.ArrayList;
import java.util.List;

public class divisibleNumbersTo5 {
    public static void main(String[] args) {
        int[] list1 = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        List<Integer> divisibleTo5=new ArrayList<Integer>();

        for(int i=0; i<list1.length; i++){
            if(list1[i]%5==0 && list1[i]<150){
                divisibleTo5.add(list1[i]);

            }
        }
        System.out.println("The divisible to 5 numbers from the initial list {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200} and are less than 150 are: "+divisibleTo5);
    }
}
