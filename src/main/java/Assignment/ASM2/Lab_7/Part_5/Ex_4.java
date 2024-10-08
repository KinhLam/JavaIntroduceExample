package Assignment.ASM2.Lab_7.Part_5;

import java.util.TreeMap;

public class Ex_4 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "C");
        treeMap.put(1, "A");
        treeMap.put(4, "D");
        treeMap.put(2, "B");

        treeMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}
