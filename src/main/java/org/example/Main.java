package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter second: ");
        int s = sc.nextInt();

        int hour, minute, second;
        hour = s / 3600;
        minute = s % 3600 / 60;
        second = s % 3600 % 60;

        System.out.println(hour + ":" + minute + ":" + second);

//        Second
        System.out.println(s/3600 + " Hour " + (s % 3600) / 60 + " Minute " + s % 60 + " Second. ");

//        int a, b, c;
//        System.out.print("Input num a: ");
//        a = sc.nextInt();
//        System.out.print("Input num b: ");
//        b = sc.nextInt();
//        System.out.print("Input num c: ");
//        c = sc.nextInt();
//        System.out.println("The sum is: " + ((a + b + c) / 3));
//        double fahrenheit;
//        System.out.print("Enter fahrenheit: ");
//        fahrenheit = sc.nextDouble();
//        double celsius = ((5 / 9) * (fahrenheit - 32));
//        System.out.println("Celsius: " + celsius);


    }
}