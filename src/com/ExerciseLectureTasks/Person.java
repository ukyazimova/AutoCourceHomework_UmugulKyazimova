package com.ExerciseLectureTasks;

import java.util.Date;
import java.util.Scanner;

public class Person {

    final String name;
    final String sex;
    final String religion;
    final String langSpoken;
    String occupation;
    final String nationality;
    final String personalID;
    final String dOb;
    final int age;
    String country;
    String fullPersonalID;
    public int isValid = 0;


    public Person(String name, String religion, String langSpoken, String occupation, String nationality, String country) {
        this.name = name;
        this.personalID = addPersonalID();
        this.sex = addSex();
        this.religion = religion;
        this.langSpoken = langSpoken;
        this.occupation = occupation;
        this.nationality = nationality;
        this.dOb = addDoB();
        this.age = genAge();
        this.country = country;
    }

    /**
     * The method is used for creating a valid personalID/EGN
     *
     * @return String
     */
    public String addPersonalID() {
        Scanner myInput = new Scanner(System.in);
        myInput.reset();
        System.out.println("Enter 10 digit value for the personalId: ");
        String input = myInput.nextLine();

        if (input.chars().count() != 10 || !(input.matches("[0-9]+"))) {
            System.out.println("The personal ID should be exactly 10 digits long. You entered " + input.length() + " digits");
            addPersonalID();
        }
        if (input.chars().count() == 10 && input.matches("[0-9]+")) {
            isValid = 1;
            fullPersonalID = input;
        }


        return fullPersonalID;
    }

    public String addDoB() {

        if (isValid == 1) {
            String yearOfBirth = fullPersonalID.substring(0, 2);
            String monthOfBirth = fullPersonalID.substring(2, 4);
            String dayOfBirth = fullPersonalID.substring(5, 7);
            String dateOfBirth = dayOfBirth + "." + monthOfBirth + "." + yearOfBirth;
            System.out.println("The dateOfBirth of the person is: " + dateOfBirth);
            return dateOfBirth;
        } else {
            addPersonalID();
            return "not valid DoB";
        }

    }

    public int genAge() {
        if (isValid == 1) {
            int yearOfBirth = Integer.parseInt(fullPersonalID.substring(0, 2));
            Date d = new Date();
            int year = d.getYear();
            int age = year - yearOfBirth;
            System.out.println("The age of the person is: " + age);

            return age;
        } else {
            addPersonalID();
            return 0;
        }
    }

    public String addSex() {
        Scanner sexInput = new Scanner(System.in);
        System.out.println("Enter the sex of the person: ");
        String sexInput1 = sexInput.nextLine();

        if (!(sexInput1.equals("male")) && !(sexInput1.equals("female"))) {
            System.out.println("There is no such valid sex as:" + sexInput1);
        }
        System.out.println("You entered " + sexInput1 + " as sex");
        return sexInput1;
    }

    public static String sayHello() {
        //sayHello() should print Hello based on concrete person spoken language, default is in English.

        Scanner langScan = new Scanner(System.in);
        System.out.println("Enter the spoken language of the person: ");
        String langInput = langScan.nextLine();
        String helloMessage = "Hello";

        if (langInput.equals("english")) {
            helloMessage = "Hello!";
        }
        if (langInput.equals("italian")) {
            helloMessage = "Boncorno!";
        }
        if (langInput.equals("bulgarian")) {
            helloMessage = "Здравей!";

        }

        System.out.println(helloMessage);
        return helloMessage;
    }

    public static String celebrateEaster() {
        //celebrateEaster() should print if the concrete person celebrates Easter based on their religion.

        Scanner religionScan = new Scanner(System.in);
        System.out.println("Enter the religion of the person: ");
        String relInput = religionScan.nextLine();
        String easterMessage = "Does NOT celebrate Easter";

        if (relInput.equals("Catholic")) {
            easterMessage = "Celebrates Easter!";
        }
        if (relInput.equals("Orthodox")) {
            easterMessage = "Does NOT celebrate Easter!";
        }
        if (relInput.equals("Islam")) {
            easterMessage = "Does NOT celebrate Easter!";

        }

        System.out.println(easterMessage);
        return easterMessage;
    }

    public static String canTakeLoan() {
        //canTakeLoan is based on the job.

        Scanner jobScan = new Scanner(System.in);
        System.out.println("Enter the job of the person: ");
        String jobInput = jobScan.nextLine();
        String loanMessage = "Can take Loan";

        if (jobInput.equals("student")) {
            loanMessage = "Can NOT take Loan!";
        }
        if (jobInput.equals("doctor")) {
            loanMessage = "Can take Loan";
        }
        if (jobInput.equals("QA")) {
            loanMessage = "Can take Loan";

        }

        System.out.println(loanMessage);
        return loanMessage;
    }

    public static String isAdult(int age) {
        Scanner countryScanner = new Scanner(System.in);
        System.out.println("Please enter persons country: ");
        String country = countryScanner.nextLine();
        // int age = genAge();
        String adultMessage = "NOT adult";

        if (age >= 18 & (country.equals("Bulgaria") || country.equals("italia"))) {
            adultMessage = "adult";
        }
        if (age >= 21 & country.equals("USA")) {
            adultMessage = "adult";
        }

        System.out.println("You are " + adultMessage + ".");
        return adultMessage;

    }

    public static void main(String[] args) {
        Person personObj = new Person("John Doe", "christian", "English", "QA", "American", "USA");
        sayHello();
        celebrateEaster();
        System.out.println(isAdult(personObj.genAge()));
        canTakeLoan();
    }
}
