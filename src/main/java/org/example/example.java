package org.example;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {
       bmiCaculator();
    }

    public static void bmiCaculator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Meter: ");
        double meter = sc.nextDouble();
        System.out.println("Enter weight: ");
        double weight = sc.nextDouble();
        System.out.println("Your BMI: " + (weight / (meter * meter)));

        double bmi = (meter / Math.pow(weight, 2));
        System.out.println("Your BMI is " + bmi);
    }
}
