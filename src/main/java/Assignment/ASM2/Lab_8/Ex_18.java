package Assignment.ASM2.Lab_8;

import java.io.File;

class FileValidationException_Ex18 extends Exception {
    public FileValidationException_Ex18(String message) {
        super(message);
    }
}

class FileValidator_Ex18{
    public void validateFileName(String fileName) throws FileValidationException_Ex18 {
        File file = new File(fileName);
        if(!file.exists() || !file.canRead()){
            throw new FileValidationException_Ex18("File is not readable");
        }
        System.out.println("File is a valid and accessible");
    }
}
public class Ex_18 {
    public static void main(String[] args) {
        FileValidator_Ex18 file = new FileValidator_Ex18();
        try{
            file.validateFileName("src/main/java/Lab_8/validfile.txt");
            file.validateFileName("src/main/java/Lab_8/invalidfile.txt");
        }catch (FileValidationException_Ex18 e){
            System.out.println(e.getMessage());
        }
    }
}
