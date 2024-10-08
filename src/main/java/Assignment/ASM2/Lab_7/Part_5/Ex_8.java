package Assignment.ASM2.Lab_7.Part_5;

import java.util.Scanner;
import java.util.TreeMap;

public class Ex_8 {
    public static void main(String[] args) {
        TreeMap<String, Integer> keymap = new TreeMap<>();
        Scanner sc = new Scanner(System.in);

        keymap.put("Apple", 3);
        keymap.put("Banana", 2);
        keymap.put("Orange", 1);


        System.out.println("Enter a key remove: ");
        String key = sc.nextLine();
        if(keymap.remove(key) != null) {
            System.out.println("Key removed: " + key);
        }else{
            System.out.println("Key not found");
        }
    }
}
