package com.ExerciseLectureTasks;

public class Italian extends Person
{


    public Italian(String name, String religion, String langSpoken, String occupation, String nationality, String country) {
        super(name, religion, langSpoken, occupation, nationality, country);
    }

    public static void main(String[] args) {
        Person persItalianObject = new Person("Георги", "Orthodox", "italian", "doctor", "italian", "Italia");
        sayHello();
        celebrateEaster();
        isAdult(persItalianObject.genAge());
        canTakeLoan();
    }
}
