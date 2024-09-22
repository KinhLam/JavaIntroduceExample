package Lab.LabInClass.Ex_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Service {
    private List<Book> books;
    private List<Magazine> magazines;

    public Service() {
        this.books = new ArrayList<>();
        this.magazines = new ArrayList<>();
    }


    //1. Them Book
    public void addBook(Book book) {
        if(isValiIsbn(book.getIsbn())){
            books.add(book);
            System.out.println("Book added");
        }else{
            System.out.println("ISBN not valid. Book not added");
        }
    }

    //2. Them Magazine
    public void addMagazine(Magazine magazine) {
        magazines.add(magazine);
        System.out.println("Magazine added");
    }

    //3
    public void displayPublicationsYearAndPublisher(int year, String publisher) {
        System.out.println("Publications in " + year + " by " + publisher + ":");

        books.stream()
                .filter(b -> b.getPublicationYear() == year && b.getPublisher().equalsIgnoreCase(publisher))
                .forEach(Book::display);

        magazines.stream()
                .filter(m -> m.getPublicationYear() == year && m.getPublisher().equalsIgnoreCase(publisher))
                .forEach(Magazine::display);
    }

    //4
    public void addAuthorToBook(String isbn, String author) {
        Optional<Book> bookOptional = books.stream()
                .filter(book -> book.getIsbn().equals(isbn))
                .findFirst();
        if(bookOptional.isPresent()){
            if(bookOptional.get().getAuthor().contains(author)){
                System.out.println("Author already exists");
            }else{
                bookOptional.get().getAuthor().add(author);
                System.out.println("Author added successfully");
            }
        }
    }

    //5
    public void displayTop10Magazines(){
        System.out.println("Top 10 magazines: ");
        magazines.stream()
                .sorted(Comparator.comparing(Magazine::getPublicationYear).reversed())
                .limit(10)
                .forEach(magazine -> magazine.display());
    }

    //6.
    public void searchBookByIsbn(String isbn){
        books.stream()
                .filter(book -> book.getIsbn().equals(isbn))
                .sorted(Comparator.comparing(Book::getIsbn).thenComparing(Book::getPublicationDate))
                .forEach(Book::display);
    }

    //7
    public void searchBookByAuthor(String author){
        books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .sorted(Comparator.comparing(Book::getIsbn).thenComparing(Book::getPublicationDate))
                .forEach(Book::display);
    }

    //8
    public void searchBookByPublisher(String publisher){
        books.stream()
                .filter(book -> book.getPublisher().equals(publisher))
                .sorted(Comparator.comparing(Book::getIsbn).thenComparing(Book::getPublicationDate))
                .forEach(Book::display);
    }

    private boolean isValiIsbn(String isbn) {
        //Kiểm tra đoạn mã isbn có phù hợp với yêu cầu của đề bài chưa
        return isbn.matches("\\d{3}-\\d{1}-\\d{2}-\\d{4}") && isbn.length() >= 10 && isbn.length() <= 17;
    }
}
