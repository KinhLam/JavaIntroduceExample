package Assignment.ASM2.Lab_7.Part_7;

import java.util.Scanner;
import java.util.TreeSet;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> unique = new TreeSet<>();

        System.out.println("Enter a sentence: ");
        String[] words = sc.nextLine().split(" ");
        for (String word : words) {
            unique.add(word);
        }
        System.out.println(unique);
    }
}
