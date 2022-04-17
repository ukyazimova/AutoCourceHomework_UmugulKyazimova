package com.operatorsHomework;

import java.util.Scanner;

public class vacationSuggestion {
    public static void main(String[] args) {
        //Below is the task for giving suggestions for vacation based on destination, persons, and budget.

        String[] vacationOptions = {"Beach", "Mountain"};

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your desired vacation type");
        String vacationType = myScanner.nextLine();

        if(vacationType.equals("Beach") || vacationType.equals("Mountain")){

        System.out.println("Please enter your desired vacation count of days");
        String vacationDaysCount = myScanner.nextLine();
        System.out.println("Please enter your the count of persons for the reservation");
        String personsCount = myScanner.nextLine();
        System.out.println("Please enter your budget per day");
        String budget = myScanner.nextLine();

        boolean isValid = true;
        int budgetToInt = 0;

        try {
             Integer.parseInt(vacationDaysCount);
             Integer.parseInt(personsCount);
            budgetToInt = Integer.parseInt(budget);
        } catch (NumberFormatException e) {
            isValid = false;
        }

        String destinationSuggestion;

        if(isValid){
            //I'm not sure why only for beach returns outside of Bulgaria all the time
            destinationSuggestion = (vacationType.equals("Beach") && (budgetToInt<=50) ? "We suggest you to Visit Bulgaria." : "We suggest you to go Outside Bulgaria.");
            destinationSuggestion = (vacationType.equals("Mountain") && (budgetToInt<=30) ? "We suggest you to Visit Bulgaria." : "We suggest you to go Outside Bulgaria.");
            System.out.println(destinationSuggestion);
        }
    }
        else
        {
            System.out.println("We're sorry but there is no information about this type of vacation.");
        }
    }
}
