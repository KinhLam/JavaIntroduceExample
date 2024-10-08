package Assignment.ASM2.Lab_7.Part_8;

import java.util.TreeSet;

class Book_Ex3 implements Comparable<Book_Ex3> {
    String title;
    String author;
    int publicationYear;

    public Book_Ex3(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    @Override
    public int compareTo(Book_Ex3 o) {
        return Integer.compare(this.publicationYear, o.publicationYear);
    }

    @Override
    public String toString() {
        return "Book_Ex3{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
public class Ex_3 {
    public static void main(String[] args) {
        TreeSet<Book_Ex3> books = new TreeSet<>();
        books.add(new Book_Ex3("NoName", "Kinh", 2019));
        books.add(new Book_Ex3("NameNo", "Lam", 2016));
        books.add(new Book_Ex3("NoNoName", "Duc", 2024));

        System.out.println("Book sorted by publication year: ");
        for(Book_Ex3 b : books) {
            System.out.println(b);
        }
    }
}
