package Assignment.ASM2.Lab_7.Part_6;

import java.util.TreeMap;

class Book_Ex4 implements Comparable<Book_Ex4> {
    String title;
    String author;
    int publicationYear;

    public Book_Ex4(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    @Override
    public int compareTo(Book_Ex4 o) {
        return Integer.compare(this.publicationYear, o.publicationYear);
    }

    @Override
    public String toString() {
        return "Book_Ex4{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}

public class Ex_4 {
    public static void main(String[] args) {
        TreeMap<Integer, Book_Ex4> bookMap = new TreeMap<>();
        bookMap.put(1, new Book_Ex4("Book 1", "Author 1", 2016));
        bookMap.put(2, new Book_Ex4("Book 2", "Author 2", 2016));
        bookMap.put(3, new Book_Ex4("Book 3", "Author 3", 2016));

        Book_Ex4 book = bookMap.get(1);
        System.out.println(book);
    }
}
