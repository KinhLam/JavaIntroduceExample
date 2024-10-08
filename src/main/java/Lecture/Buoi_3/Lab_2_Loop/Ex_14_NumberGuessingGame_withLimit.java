/*Exercise 14: Number Guessing Game (with Limits)
Write a program that generates a random number between 1 and 100 and prompts the user to guess
the number. Provide feedback on whether the guess is too high or too low. Limit the number of
attempts using a while loop.*/



package Lecture.Buoi_3.Lab_2_Loop;

import java.util.Random;
import java.util.Scanner;

public class Ex_14_NumberGuessingGame_withLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = rand.nextInt(100) + 1;
        int attempts = 0; // Khởi tạo giá trị ban đầu số lần dự đoán
        int maxAttempts = 7;  // Giới hạn số lượng dự đoán
        boolean guessedCorrectly = false; //Đặt giá trị là false

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have randomly chosen a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");

        // Loop until the user has either guessed the number or used up all attempts
        while (attempts < maxAttempts && !guessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = sc.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                guessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
            } else if (userGuess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }

            // Check if the user has used up all attempts
            if (attempts == maxAttempts && !guessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + randomNumber);
            }
        }
    }
}
