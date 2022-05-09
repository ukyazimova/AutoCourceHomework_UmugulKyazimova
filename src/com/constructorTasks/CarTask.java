package com.constructorTasks;

public class CarTask {
    String name;
    String color;
    int horsePower;
    int releaseYear;
    boolean secondHand;

    public CarTask(String name, String color, int releaseYear, int horsePower, boolean secondHand) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = secondHand;


    }

    CarTask(String name, String color, boolean secondHand) {
        releaseYear = -1;
        horsePower = -1;
        this.name = name;
        this.color = color;
        this.secondHand = secondHand;
    }

    CarTask(String name, String color, int releaseYear, int horsePower) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
    }

    CarTask(String name, String color, int releaseYear, boolean secondHand) {
        this.name = name;
        color = "N/A";
        this.releaseYear = releaseYear;
        this.secondHand = secondHand;
    }


    public static void main(String[] args) {
        CarTask myobj = new CarTask("VW", "black", 2000, 101);
        System.out.println(myobj.name);
        System.out.println(myobj.horsePower);
        System.out.println(myobj.releaseYear);

    }
}
