package Lab.LabInClass.Ex_1;

import java.time.LocalDate;
import java.util.Date;

class Magazine extends Publication{
    String author;
    int volumn;
    int edition;

    public Magazine(int publicationYear, String publisher, LocalDate publicationDate, String author, int volumn, int edition) {
        super(publicationYear, publisher, publicationDate);
        this.author = author;
        this.volumn = volumn;
        this.edition = edition;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getVolumn() {
        return volumn;
    }

    public void setVolumn(int volumn) {
        this.volumn = volumn;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    @Override
    public void display() {
        System.out.println("Magazine Information:");
        System.out.println("Author: " + author);
        System.out.println("Volume: " + volumn);
        System.out.println("Edition: " + edition);
        System.out.println("Publication Year: " + getPublicationYear());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Publication Date: " + getPublicationDate());
    }
}
