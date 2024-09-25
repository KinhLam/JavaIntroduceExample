/*Create a class called FileManager with methods to read and write data to a file. Implement a method
called readFromFile(String fileName) that reads data from a file and returns it as a String.
Implement another method called writeToFile(String fileName, String data) that writes the given
data to the specified file. Test the FileManager class by creating an instance, calling the
readFromFile method to read data from a file, and calling the writeToFile method to write data to a file.*/


package Lab.Java_IO.Ex_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManager {
    public static void readFromFile(String fileName) {
        File file = new File(fileName);
        try (FileInputStream fis = new FileInputStream(file)) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void writeToFile(String fileName, String data) {
        File file = new File(fileName);
        try{
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(data.getBytes());
            fos.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        FileManager fm = new FileManager();
        String fileName = "src/main/java/Lab/Java_IO/Ex_1/file.txt";
        String data = "hehe";
        fm.writeToFile(fileName, data);
        System.out.println("Ghi dữ liệu vào file thành công!");

        System.out.println("Đang đọc file");
        fm.readFromFile(fileName);
    }
}
