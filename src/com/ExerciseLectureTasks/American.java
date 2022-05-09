package com.ExerciseLectureTasks;

public class American  extends Person{
    public American(String name, String religion, String langSpoken, String occupation, String nationality, String country) {
        super(name, religion, langSpoken, occupation, nationality, country);
    }

    public static void main(String[] args) {
        Person persAmericanObject = new Person("Георги", "Catholic", "English", "QA", "american", "USA");
        sayHello();
        celebrateEaster();
        isAdult(persAmericanObject.genAge());
        canTakeLoan();
    }
}
