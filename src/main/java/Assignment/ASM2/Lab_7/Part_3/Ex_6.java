package Assignment.ASM2.Lab_7.Part_3;

import java.util.HashMap;
import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<>();
        students.put("Kinh", "Math");
        students.put("Lam", "Physics");
        students.put("Duc", "Chemistry");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a student name: ");
        String name = sc.nextLine();
        String sub = students.getOrDefault(name, "Subject not found");
        System.out.println("Favorite of "+ name + " is " + sub);
    }
}
