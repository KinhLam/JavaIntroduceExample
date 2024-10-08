package Assignment.ASM2.Lab_7.Part_1;

import java.util.HashSet;
import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        HashSet<Integer> number = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        while (sc.hasNextInt()) {
            number.add(sc.nextInt());
        }

        if(number.isEmpty()){
            System.out.println("No numbers entered");
        }
        else{
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(Integer i : number){
                if(i < min){
                    min = i;
                }
                if(i > max){
                    max = i;
                }
            }
            System.out.println("Minimum number is: " + min);
            System.out.println("Maximum number is: " + max);
        }
    }
}
