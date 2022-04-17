package com.dataStructures;

import java.util.LinkedList;

public class LinkedListTasks {
    public static void main(String[] args) {
// Below is the solution of Task5 ->  Reverse the order of the elements in a LinkedList using algorithm
        LinkedList<String> cars = new LinkedList <>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = cars.size()-1; i >=0; i--) {
            System.out.println(cars.get(i));
        }
    }
}
