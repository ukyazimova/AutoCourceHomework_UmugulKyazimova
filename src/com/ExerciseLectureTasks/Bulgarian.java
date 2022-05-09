package com.ExerciseLectureTasks;

public class Bulgarian  extends Person{
    public Bulgarian(String name, String religion, String langSpoken, String occupation, String nationality, String country) {
        super(name, religion, langSpoken, occupation, nationality, country);
    }

    public static void main(String[] args) {
        Person persBulgarinObject = new Person("Георги", "Orthodox", "bulgarian", "QA", "bulgarian", "bulgaria");
        sayHello();
        celebrateEaster();
        isAdult(persBulgarinObject.genAge());
        canTakeLoan();
    }


}
