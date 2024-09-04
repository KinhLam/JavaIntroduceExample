/*
Exercise 19: Grade Evaluation
        Write a program that prompts the user to enter a percentage score for an exam. Determine and print
        the corresponding grade based on the following conditions:
        • A: 90-100%
        • B: 80-89%
        • C: 70-79%
        • D: 60-69%
        • F: Below 60%
*/

package Buoi_3.Lab_2_FlowControl;

import java.util.Scanner;

public class Ex_19_GradeEvaluatioin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = sc.nextInt();
        if(score >= 90 && score <= 100) {
            System.out.println("A");
        }else if(score >= 80 && score < 89) {
            System.out.println("B");
        }else if(score >= 70 && score < 79) {
            System.out.println("C");
        }else if(score >= 60 && score < 69) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
