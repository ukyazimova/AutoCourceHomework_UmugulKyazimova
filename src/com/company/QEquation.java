package com.company;

import java.util.Scanner;

public class QEquation {

    public static void main(String[] args) {
        //Task 6
        System.out.println("Below we will find a standard quadratic equation result for a random entered digit combination");

        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Please enter your first value");
        double varA = myObj1.nextDouble();
        System.out.println("Please enter your second value");
        double VarB = myObj1.nextDouble();
        System.out.println("Please enter your third value");
        double varC = myObj1.nextDouble();
        System.out.println("Quadratic Equation formula: ax^2 + bx + c = 0");
        System.out.println("Our Equation : "+varA+"x^2 + "+VarB+"x + "+varC+" = 0");
        double determinant = Math.abs(((VarB*VarB)-(4*varA*varC)));

        System.out.println("The discriminant would be calculated like: D= VarB^2-4*varA*varC: " +determinant);
        System.out.println("The formula is -> x=(-b-+sqrt(D))/ 2*varA" );
        double x1 = ((VarB/(2*varA))- (Math.sqrt(determinant)) / (2 * varA));
        double x2 = ((VarB/(2*varA))+ (Math.sqrt(determinant)) / (2 * varA));

        System.out.println("x1=(-b-sqrt(D))/ 2*varA= "+ String.format("%.3f", x1));
        System.out.println("x2=(-b+sqrt(D))/ 2*varA= "+ String.format("%.3f",x2));
    }
}
