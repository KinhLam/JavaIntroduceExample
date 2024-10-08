package Assignment.ASM2.Lab_7.Part_5;

import java.util.Scanner;
import java.util.TreeMap;

public class Ex_5 {
    public static void main(String[] args) {
        TreeMap<String, Double> studentScores = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        studentScores.put("Kinh", 8.5);
        studentScores.put("Lam", 7.5);
        studentScores.put("Duc", 4.5);

        System.out.print("Enter the student: ");
        String studentName = scanner.nextLine();
        if (studentScores.containsKey(studentName)) {
            System.out.println(studentName + "'s score: " + studentScores.get(studentName));
        } else {
            System.out.println("Student not found.");
        }
    }
}
