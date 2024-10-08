package Assignment.ASM2.Lab_7.Part_4;

import java.util.HashMap;
import java.util.Objects;

class Book_Ex4{
    String title;
    String author;
    String isbn;

    public Book_Ex4(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book_Ex4 bookEx4 = (Book_Ex4) o;
        return Objects.equals(isbn, bookEx4.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    @Override
    public String toString() {
        return "Book_Ex4{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}

public class Ex_4 {
    public static void main(String[] args) {
        HashMap<String, Book_Ex4> bookMap = new HashMap<>();
        bookMap.put("123-ABC", new Book_Ex4("1984", "George Orwell", "123-ABC"));
        bookMap.put("456-DEF", new Book_Ex4("To Kill a Mockingbird", "Harper Lee", "456-DEF"));

        Book_Ex4 book = bookMap.get("123-ABC");
        System.out.println(book);
    }
}
