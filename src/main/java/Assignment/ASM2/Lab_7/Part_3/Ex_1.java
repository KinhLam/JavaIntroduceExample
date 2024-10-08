package Assignment.ASM2.Lab_7.Part_3;

import java.util.HashMap;

public class Ex_1 {
    public static void main(String[] args) {
        HashMap<String, String> student = new HashMap<>();
        student.put("Kinh", "K");
        student.put("Lam", "L");
        student.put("Duc", "D");

        System.out.println("Student: ");
        student.forEach((name, grade) -> System.out.println(name + ": " + grade));

    }
}
