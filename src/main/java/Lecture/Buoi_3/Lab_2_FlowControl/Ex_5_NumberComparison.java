/*Exercise 5: Number Comparison
Write a program that prompts the user to enter two numbers and determines if the first number is
        greater than, less than, or equal to the second number. Print the appropriate message.*/

package Lecture.Buoi_3.Lab_2_FlowControl;

import java.util.Scanner;

public class Ex_5_NumberComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number A: ");
        int a = sc.nextInt();
        System.out.print("Enter number B: ");
        int b = sc.nextInt();
        if(a > b){
            System.out.println("A greater than b");
        }else if(a < b){
            System.out.println("A smaller than b");
        }else{
            System.out.println("A equal to b");
        }
    }
}
