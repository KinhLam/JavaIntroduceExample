package Assignment.ASM2.Lab_7.Part_1;

import java.util.HashSet;
import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();

        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        for(String word : sentence.split(" ")) {
            word = word.toLowerCase();
            set.add(word);
        }

        System.out.println("Unique words: " + set);
    }
}
