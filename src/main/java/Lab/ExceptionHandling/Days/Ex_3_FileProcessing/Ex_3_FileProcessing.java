package Lab.ExceptionHandling.Days.Ex_3_FileProcessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_3_FileProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        String fileName = sc.nextLine();

        try{
            File file = new File("src/main/java/Lab/ExceptionHandling/Days/" + fileName);
            Scanner fileInput = new Scanner(file);

            System.out.println("*** The content of the file " + fileName);
            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                System.out.println(" - " + line);
            }
            fileInput.close();
        }catch(FileNotFoundException e){
            System.out.println("NOT THING");
            System.out.println("File Not Found " + fileName);

        }
    }
}
