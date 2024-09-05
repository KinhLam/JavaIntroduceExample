/*
Exercise 9: Count Characters
Write a program that prompts the user to enter a string and counts the number of occurrences of a
specific character using a for loop.
*/



package Buoi_3.Lab_2_Loop;

import java.util.Scanner;

public class Ex_9_CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter a char to count: ");
        char ch = sc.next().charAt(0);

        int count = countCharacters(str, ch);

        System.out.println("The " + ch + " character count is " + count);
    }

    private static int countCharacters(String str, char ch) {
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }
}
