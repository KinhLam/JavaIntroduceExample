package Assignment.ASM2.Lab_7.Part_5;

import java.util.Scanner;
import java.util.TreeMap;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Integer> word = new TreeMap<>();

        System.out.println("Enter the word: ");
        String sentece = sc.nextLine();

        String[] words = sentece.split(" ");
        for (String w : words) {
            w = w.toLowerCase();
            word.put(w, word.getOrDefault(w, 0) + 1);
        }
        System.out.println(word);
    }
}
