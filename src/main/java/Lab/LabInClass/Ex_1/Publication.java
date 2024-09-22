package Lab.LabInClass.Ex_1;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;

public abstract class Publication {
    int publicationYear;
    String publisher;
    LocalDate publicationDate;

    public Publication() {}

    public Publication(int publicationYear, String publisher, LocalDate publicationDate) {
        this.publicationYear = publicationYear;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public abstract void display();
}
