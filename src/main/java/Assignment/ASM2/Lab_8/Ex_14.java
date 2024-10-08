package Assignment.ASM2.Lab_8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class InvalidDataException_Ex14 extends Exception {
    public InvalidDataException_Ex14(String messageg) {
        super(messageg);
    }
}

class DataReader_Ex14 {
    public void readData(String fileName) throws InvalidDataException_Ex14 {
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String data = reader.readLine();
            if(data == null || data.isEmpty()){
                throw new InvalidDataException_Ex14("Empty file");
            }
            System.out.println("Data read: " + data);
        }catch (IOException e){
            throw new InvalidDataException_Ex14(e.getMessage());
        }
    }
}
public class Ex_14 {
    public static void main(String[] args){
        DataReader_Ex14 reader = new DataReader_Ex14();
        try{
            reader.readData("src/main/java/Lab_8/testfile.txt");
        }catch (InvalidDataException_Ex14 e){
            System.out.println(e.getMessage());
        }
    }
}
