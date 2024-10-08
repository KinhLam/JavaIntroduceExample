package Assignment.ASM2.Lab_7.Part_3;

import java.util.HashMap;
import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        HashMap<String, String> bookAuthor = new HashMap<>();
        bookAuthor.put("Clean Code", "Robert Martin");
        bookAuthor.put("Head First Java", "Kathy Sierra");
        bookAuthor.put("Effective Java", "Joshua Bloch");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book name: ");
        String bookName = sc.nextLine();

        String authors = bookAuthor.getOrDefault(bookName, "Book not found");
        System.out.println("Authors of book " + bookName + " is " + authors);
    }
}
