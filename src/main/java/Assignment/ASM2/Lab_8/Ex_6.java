package Assignment.ASM2.Lab_8;

import java.util.Arrays;
import java.util.List;

class DataProcessingException extends Exception{
    public DataProcessingException(String s){
        super(s);
    }
}

class DataProcessor {
    public void processData(List<String> data) throws DataProcessingException {
        if (data == null || data.isEmpty()) {
            throw new DataProcessingException("Data list is null or empty.");
        }
        data.forEach(System.out::println);
    }
}

public class Ex_6 {
    public static void main(String[] args) {
        DataProcessor dp = new DataProcessor();
        try{
            dp.processData(Arrays.asList("Laptop", "Phone"));
            dp.processData(null);
        }catch (DataProcessingException e){
            System.out.println(e.getMessage());
        }
    }
}
