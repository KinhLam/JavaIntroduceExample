package Assignment.ASM2.Lab_7.Part_7;

import java.util.Scanner;
import java.util.TreeSet;

public class Ex_6 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Pear");

        System.out.println("Enter a letter remove: ");
        String letter = sc.nextLine();
        set.removeIf(str -> str.startsWith(letter));
        System.out.println("TreeSet after removing: " + set);
    }
}
