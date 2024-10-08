package Assignment.ASM2.Lab_8;

import java.io.File;

class FileReadingException extends Exception{
    public FileReadingException(String s){
        super(s);
    }
}

class FileReader{
    public void readFile(String fileName) throws FileReadingException{
        File file = new File(fileName);
        if(!file.exists() || !file.canRead()){
            throw new FileReadingException("File not found");
        }
        System.out.println("File read successfully");
    }
}
public class Ex_22 {
    public static void main(String[] args) {
        FileReader fr = new FileReader();
        try {
            fr.readFile("src/main/java/Lab_8/test.txt");
        }catch (FileReadingException e){
            System.out.println(e.getMessage());
        }
    }
}
