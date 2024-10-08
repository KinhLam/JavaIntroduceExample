//While, do-While, for

//Khi nào sử dụng while
//continue
//for 2 vong lap


package Lecture.Buoi_2;

import java.util.Random;
import java.util.Scanner;

public class Java_Loop {
    public static void main(String[] args) {
        guessWhileNumbers();
    }

    public static void whileExample(){
        int counter = 0;
        while (counter < 10) {
            System.out.println("Hello FJB_05");
            counter++;
        }
    }

    public static void doWhileExample(){
        Scanner sc = new Scanner(System.in);
        int useNumber;
        do {
            System.out.println("Nhap so tu 1 -> 10: ");
            useNumber = sc.nextInt();
        }while(useNumber < 1 || useNumber > 10);
        System.out.println("Ban nhap so hop le" + useNumber);
    }

    public static void forExample(){
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void guessDoWhileNumbers(){
        Scanner sc = new Scanner(System.in);
        int useNumber;
        int num1 = (int) (Math.random()*10);
        do {
            System.out.println("Nhap so tu 1 -> 10: ");
            useNumber = sc.nextInt();

            if (useNumber == num1) {
                System.out.println("Bạn đã đoán chính xác");
                break;  // Exit the loop when the guess is correct
            } else {
                System.out.println("Bạn chưa đoán đúng, hãy đoán lại");
            }
        } while (true);  // Keep looping until the correct number is guessed
    }

    public static void guessWhileNumbers() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;  // Random number between 1 and 100
        int userGuess = -1;

        System.out.println("Guess the number between 1 and 100");

        while (userGuess != number) {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();

            if (userGuess > number) {
                System.out.println("Too High");
            } else if (userGuess < number) {
                System.out.println("Too Low");
            }
        }
        System.out.println("You guessed it right!");
    }
}
