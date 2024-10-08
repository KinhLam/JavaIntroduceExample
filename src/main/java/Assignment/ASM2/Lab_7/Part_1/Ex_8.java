package Assignment.ASM2.Lab_7.Part_1;

import java.util.HashSet;

public class Ex_8 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Hello");
        set.add("World");

        if(set.isEmpty()){
            System.out.println("Hashset is empty");
        }else{
            System.out.println("Hashset is not empty." + set);
        }
    }
}
