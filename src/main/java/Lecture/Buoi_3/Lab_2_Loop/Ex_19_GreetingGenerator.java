/*Exercise 19: Greeting Generator
Write a program that prompts the user to enter their name and prints a personalized greeting
message. Repeat the process until the user enters "quit" using a do...while loop*/


package Lecture.Buoi_3.Lab_2_Loop;

import java.util.Scanner;

public class Ex_19_GreetingGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;

        do {
            System.out.println("Nhập tên của bạn (Nhập Exit để rời khỏi chương trình): ");
            name = sc.nextLine();

            //Tạo điều kiện nếu tên nhập k có từ Exit thì tiếp tục chương trình
            if(!name.equalsIgnoreCase("Exit")){
                System.out.println("Xin chào " + name);
            }
        }while(!name.equalsIgnoreCase("Exit"));
    }
}
