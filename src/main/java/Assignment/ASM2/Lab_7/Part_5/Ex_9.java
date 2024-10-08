package Assignment.ASM2.Lab_7.Part_5;

import java.util.TreeMap;

public class Ex_9 {
    public static void main(String[] args) {
        TreeMap<Integer, String> keymap = new TreeMap<>();

        keymap.put(10, "Ten");
        keymap.put(20, "Eleven");
        keymap.put(30, "Twelve");

        System.out.println("Small " + keymap.firstKey());
        System.out.println("Big " + keymap.lastKey());
    }
}
