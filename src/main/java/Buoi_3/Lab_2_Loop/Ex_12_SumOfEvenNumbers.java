/*Exercise 12: Sum of Even Numbers
Write a program that calculates and prints the sum of all even numbers between 1 and 100 using a
for loop.*/

package Buoi_3.Lab_2_Loop;

public class Ex_12_SumOfEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
