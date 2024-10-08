package Assignment.ASM2.Lab_7.Part_5;

import java.util.Scanner;
import java.util.TreeMap;

public class Ex_7 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        treeMap.put("Apple", 3);
        treeMap.put("Banana", 2);
        treeMap.put("Mango", 5);

        System.out.print("Enter a key to search: ");
        String key = scanner.nextLine();

        if (treeMap.containsKey(key)) {
            System.out.println("Key found: " + key + ", Value: " + treeMap.get(key));
        } else {
            System.out.println("Key not found.");
        }
    }
}
