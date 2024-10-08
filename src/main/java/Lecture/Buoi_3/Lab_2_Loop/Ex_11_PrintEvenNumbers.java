/*Exercise 11: Print Even Numbers
Write a program that uses a for loop to print all even numbers between 1 and 50 on the console*/


package Lecture.Buoi_3.Lab_2_Loop;

public class Ex_11_PrintEvenNumbers {
    public static void main(String[] args) {
        for(int i = 1; i <= 50; i++){
            //% là chia hết
            // "/" là chia lấy dư
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
