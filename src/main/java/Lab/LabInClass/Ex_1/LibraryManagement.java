package Lab.LabInClass.Ex_1;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LibraryManagement {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add a new book");
            System.out.println("2. Add a new magazine");
            System.out.println("3. Display publications by year and publisher");
            System.out.println("4. Add an author to a book");
            System.out.println("5. Display top 10 magazines by volume");
            System.out.println("6. Search book by ISBN");
            System.out.println("7. Search book by author");
            System.out.println("8. Search book by publisher");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1 -> addBook();
                case 2 -> addMagazine();
                case 3 -> displayPublicationsYearAndPublisher();
                case 4 -> addAuthorToBook();
                case 5 -> displayTop10Magazines();
                case 6 -> searchBookByIsbn();
                case 7 -> searchBookByAuthor();
                case 8 -> searchBookByPublisher();
                case 9 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }



    private static void addBook() {
        Service service = new Service();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ISBN: (xxx-x-xx-xxxx)");
        String isbn = sc.nextLine();
        System.out.print("Enter publication year: ");
        int year = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter publisher: ");
        String publisher = sc.nextLine();
        System.out.print("Enter publication date (YYYY-MM-DD): ");
        LocalDate date = LocalDate.parse(sc.nextLine());
        System.out.print("Enter publication place: ");
        String place = sc.nextLine();
        System.out.print("Enter number of authors: ");
        int authorCount = sc.nextInt();
        sc.nextLine(); // Consume newline
        Set<String> authors = new HashSet<>();
        for (int i = 0; i < authorCount; i++) {
            System.out.print("Enter author name: ");
            authors.add(sc.nextLine());
        }

        Book book = new Book(year, publisher, date, isbn, authors, place);
        service.addBook(book);
    }


    private static void addMagazine() {
        Service service = new Service();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter publication year: ");
        int year = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter publisher: ");
        String publisher = sc.nextLine();
        System.out.print("Enter publication date (YYYY-MM-DD): ");
        LocalDate date = LocalDate.parse(sc.nextLine());
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        System.out.print("Enter volume: ");
        int volume = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter edition: ");
        int edition = sc.nextInt();

        Magazine magazine = new Magazine(year, publisher, date, author, volume, edition);
        service.addMagazine(magazine);
    }

    private static void displayPublicationsYearAndPublisher() {
        Service service = new Service();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter publisher: ");
        String publisher = sc.nextLine();
        service.displayPublicationsYearAndPublisher(year, publisher);
    }

    private static void addAuthorToBook() {
        Service service = new Service();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book ISBN: ");
        String isbn = sc.nextLine();
        System.out.print("Enter author name: ");
        String author = sc.nextLine();
        service.addAuthorToBook(isbn, author);
    }

    private static void displayTop10Magazines() {
        Service service = new Service();
        service.displayTop10Magazines();
    }

    private static void searchBookByIsbn() {
        Service service = new Service();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();
        service.searchBookByIsbn(isbn);
    }

    private static void searchBookByAuthor() {
        Service service = new Service();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter author name: ");
        String author = sc.nextLine();
        service.searchBookByAuthor(author);
    }

    private static void searchBookByPublisher() {
        Service service = new Service();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter publisher name: ");
        String publisher = sc.nextLine();
        service.searchBookByPublisher(publisher);
    }
}
