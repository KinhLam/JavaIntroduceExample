package Assignment.ASM2.Lab_7.Part_1;

import java.util.HashSet;
import java.util.Scanner;

public class Ex_9 {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        while (sc.hasNextInt()) {
            nums.add(sc.nextInt());
        }

        System.out.println("Distinct even numbers: ");
        for(Integer num : nums){
            if(num % 2 == 0){
                System.out.print(num + " ");
            }
        }
    }
}
