package Assignment.ASM2.Lab_7.Part_1;

import java.util.HashSet;
import java.util.Scanner;

public class Ex_7 {
    public static void main(String[] args) {
        HashSet<Double> num = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        while (sc.hasNextDouble()) {
            num.add(sc.nextDouble());
        }

        double sum = 0.0;
        for(double n : num){
            sum += n;
        }
        System.out.println("Sum: "+ sum);
    }
}
