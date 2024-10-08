/*
Exercise 12: Temperature Converter
        Write a program that prompts the user to enter a temperature in Celsius or Fahrenheit. Convert the
        temperature to the other unit and display the converted value.
*/


package Lecture.Buoi_3.Lab_2_FlowControl;

import java.util.Scanner;

public class Ex_12_TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();
        System.out.print("Enter the temperature in Kelvin: ");
        double kelvin = sc.nextDouble();
        double fahrenheitTemp = fahrenheit - 32;
        double celsiusTemp = celsius + 273.15;
        double kelvinTemp = kelvin - 273.15;

        System.out.println(fahrenheitTemp + " Fahrenheit" + celsiusTemp + " Celsius" + kelvinTemp);
    }
}
