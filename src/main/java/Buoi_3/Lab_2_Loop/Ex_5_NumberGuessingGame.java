/*
Exercise 5: Number Guessing Game
Write a program that generates a random number between 1 and 100 and prompts the user to guess
the number. Provide feedback on whether the guess is too high or too low using a do...while loop.
*/


package Buoi_3.Lab_2_Loop;

import java.util.Random;
import java.util.Scanner;

public class Ex_5_NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int number = rand.nextInt(100);
        int guess;
        do {
            System.out.println("Guess a number between 1 and 100");
            guess = sc.nextInt();
        }while (guess != number);
    }

}
