package Assignment.ASM2.Lab_7.Part_2;

import java.util.HashSet;
import java.util.TreeSet;

class Book_Ex4 implements Comparable<Book_Ex4> {
    String title;
    String author;
    String ISBN;

    public Book_Ex4(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    @Override
    public int compareTo(Book_Ex4 other) {
        return this.title.compareTo(other.title);
    }
    @Override
    public String toString() {
        return "Book_Ex4{" +
                "titile='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
}

public class Ex_4 {
    public static void main(String[] args) {
        HashSet<Book_Ex4> books = new HashSet<>();
        books.add(new Book_Ex4("The Catcher in the Rye", "J.D. Salinger", "12345"));
        books.add(new Book_Ex4("1984", "George Orwell", "54321"));
        books.add(new Book_Ex4("To Kill a Mockingbird", "Harper Lee", "67890"));

        TreeSet<Book_Ex4> sortedBooks = new TreeSet<>(books);
        sortedBooks.forEach(System.out::println);
    }
}
