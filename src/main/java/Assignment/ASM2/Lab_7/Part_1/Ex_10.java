package Assignment.ASM2.Lab_7.Part_1;

import java.util.HashSet;

public class Ex_10 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Hello");
        set.add("Worldd");
        set.add("Java");
        set.add("FPT");

        if(set.isEmpty()){
            System.out.println("Empty is null");
        }

        String longest = "";
        for(String s : set){
            if(s.length() > longest.length()){
                longest = s;
            }
        }
        System.out.println(longest);
    }
}
