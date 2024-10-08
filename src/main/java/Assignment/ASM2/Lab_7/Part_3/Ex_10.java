package Assignment.ASM2.Lab_7.Part_3;

import java.util.HashMap;

public class Ex_10 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("apple", 1.0);
        fruit.put("orange", 2.0);
        fruit.put("banana", 3.0);

        double total = 0.0;
        for(double price : fruit.values()) {
            total += price;
        }
        System.out.println("Total: " + total);
    }
}
