package Assignment.ASM2.Lab_7.Part_7;

import java.util.Scanner;
import java.util.TreeSet;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> names = new TreeSet<>();

        names.add("John");
        names.add("Jane");
        names.add("Bob");

        System.out.println("Enter name to check" );
        String name = sc.nextLine();
        if(names.contains(name)){
            System.out.println(name + " exists the TreeSet");
        }else{
            System.out.println(name + " does not exist");
        }
    }
}
