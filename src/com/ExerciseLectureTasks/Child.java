package com.ExerciseLectureTasks;

public class Child extends Person{
    public Child(String name, String religion, String langSpoken, String occupation, String nationality, String country) {
        super(name, religion, langSpoken, occupation, nationality, country);
    }
    public static void main(String[] args) {
        Person persChildObject = new Person("Георги", "Orthodox", "bulgarian", "student", "bulgarian", "bulgaria");
        sayHello();
        celebrateEaster();
        isAdult(persChildObject.genAge());
        canTakeLoan();
    }

}
