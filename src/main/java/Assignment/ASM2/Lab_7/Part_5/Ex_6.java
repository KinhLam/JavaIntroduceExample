package Assignment.ASM2.Lab_7.Part_5;

import java.util.TreeMap;

public class Ex_6 {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        treeMap.put(1, 100);
        treeMap.put(2, 200);
        treeMap.put(3, 300);

        int sum = treeMap.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of all values: " + sum);
    }
}
