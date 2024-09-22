package Lab.LabInClass.Ex_1;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

class Book extends Publication {
    String isbn;
    Set<String> author;
    String publicationPlace;

    public Book(int publicationYear, String publisher, LocalDate publicationDate, String isbn, Set<String> author, String publicationPlace) {
        super(publicationYear, publisher, publicationDate);
        this.isbn = isbn;
        this.author = new HashSet<>();
        this.publicationPlace = publicationPlace;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Set<String> getAuthor() {
        return author;
    }

    public void setAuthor(Set<String> author) {
        this.author = author;
    }

    public String getPublicationPlace() {
        return publicationPlace;
    }

    public void setPublicationPlace(String publicationPlace) {
        this.publicationPlace = publicationPlace;
    }

    @Override
    public void display() {
        System.out.println("Book Infomation");
        System.out.println("ISBN: " + isbn);
        System.out.println("Author: " + author);
        System.out.println("Publication Place: " + publicationPlace);
        System.out.println("Publication Year: " + getPublicationYear());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Publication Date: " + getPublicationDate());
    }
}
