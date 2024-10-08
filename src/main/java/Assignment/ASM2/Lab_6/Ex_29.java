package Assignment.ASM2.Lab_6;

import java.util.LinkedList;

class Book{
    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}

public class Ex_29 {
    String name;
    LinkedList<Book> books = new LinkedList<>();

    public Ex_29(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String title) {
        books.removeIf(b -> b.title.equalsIgnoreCase(title));
    }

    public void searchBook(String title) {
        for (Book book : books) {
            if(book.title.toLowerCase().contains(title.toLowerCase())) {
                System.out.println(book);
            }
        }
    }

    public void searchBookByAuthor(String author) {
        for (Book book : books) {
            if(book.author.equalsIgnoreCase(author)) {
                System.out.println(books);
            }
        }
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }


    public static void main(String[] args) {
        Ex_29 ex = new Ex_29("Java");
        ex.addBook(new Book("Java", "John Smith", 2015));
        ex.addBook(new Book("C#", "John Smith", 2014));
        ex.addBook(new Book("SQL", "John Smith", 2013));

        ex.displayBooks();

        ex.searchBook("2015");
        ex.searchBookByAuthor("John Smith");

        ex.removeBook("SQL");
        ex.displayBooks();
    }
}
