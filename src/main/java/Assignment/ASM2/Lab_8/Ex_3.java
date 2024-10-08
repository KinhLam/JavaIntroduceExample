package Assignment.ASM2.Lab_8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileParsingException extends Exception{
    public FileParsingException(String s){
        super(s);
    }
}

class FileParser{
    public void parseFile(String filename) throws FileParsingException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new FileParsingException("File not found: " + filename);
        } catch (IOException e) {
            throw new FileParsingException("Error reading the file: " + filename);
        }
    }
}
public class Ex_3 {
    public static void main(String[] args) {
        FileParser fp = new FileParser();
        try{
            fp.parseFile("src/main/java/Lab_8/test.txt");
        }catch (FileParsingException e) {
            System.out.println(e.getMessage());
        }
    }
}
