package Assignment.ASM2.Lab_8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class DataProcessingException_Ex9  extends Exception{
    public DataProcessingException_Ex9(String s){
        super(s);
    }
}

class DataReader{
    public void readDataFromFile(String filename) throws DataProcessingException_Ex9{
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new DataProcessingException_Ex9("Failed to read or process the file: " + filename);
        }
    }
}
public class Ex_9 {
    public static void main(String[] args){
        DataReader dataReader = new DataReader();

        try {
            dataReader.readDataFromFile("data.txt");
        } catch (DataProcessingException_Ex9 e) {
            System.out.println(e.getMessage());
        }
    }
}
