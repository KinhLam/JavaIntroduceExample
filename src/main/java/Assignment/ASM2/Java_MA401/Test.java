package Assignment.ASM2.Java_MA401;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MultimediaManagement management = new MultimediaManagement();
        int choice;

        do {
            System.out.println("Choose funtion: ");
            System.out.println("1. Add a new Video");
            System.out.println("2. Add a new Song");
            System.out.println("3. Show all Multimedia");
            System.out.println("4. Exit Program");
            System.out.println("Your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("----Enter video information----");
                    System.out.print("Enter name: ");
                    String videoName = sc.nextLine();
                    System.out.print("Enter duration: ");
                    double videoDuration = sc.nextDouble();
                    Video video = new Video(videoName, videoDuration);
                    management.addMultimedia(video);
                    break;
                case 2:
                    System.out.println("----Enter song information----");
                    System.out.print("Enter name: ");
                    String songName = sc.nextLine();
                    System.out.print("Enter duration: ");
                    double songDuration = sc.nextDouble();
                    sc.nextLine();  // Consume newline
                    System.out.print("Enter singer: ");
                    String singer = sc.nextLine();
                    Song song = new Song(songName, songDuration, singer);
                    management.addMultimedia(song);
                    break;
                case 3:
                    management.displayMultimedia();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }while (choice != 4);
    }
}
