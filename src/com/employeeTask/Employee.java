package com.employeeTask;

public class Employee {
    final int id ;
    final String fName;
    final String lName;

    private double salary;

    public Employee(int id, String fName, String lName) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
    }

    String getName(){
        return fName +' ' +lName;
    }

    double getAnnualSalary(double annSalary){
     return  annSalary;
    }

    int raiseSalary(int percentage){
        return percentage;
    }

    public static void main(String[] args) {
        Employee myEmp = new Employee(12, "John", "Doe");
        System.out.println("The Employee full name is: "+myEmp.getName() +" id is: "+ myEmp.id);
        System.out.println("The annual salary of " + myEmp.getName() + " is: " + myEmp.getAnnualSalary(1600.8));
        System.out.println("The X% that the salary will be updated is: " + myEmp.raiseSalary(18));
        System.out.println("The updated salary for the annual is: "+myEmp.getAnnualSalary(1600.8)+"+("+myEmp.getAnnualSalary(1600.8)+'*'+myEmp.raiseSalary(18)+")="+(myEmp.getAnnualSalary(1600.8)+(myEmp.getAnnualSalary(1600.8)*myEmp.raiseSalary(18))));
    }

}
