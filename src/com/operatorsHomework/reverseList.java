package com.operatorsHomework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class reverseList {
    public static void main(String[] args) {
        int[] list1 = {10, 20, 30, 40, 50};
        List<Integer> reversedList=new ArrayList<Integer>();
         for(int j=list1.length-1; j>=0;j--){
                reversedList.add(list1[j]);
            }

        System.out.println("The initial list is: "+ Arrays.toString(list1));
        System.out.println("The reversed list is: "+ reversedList);
    }
}
