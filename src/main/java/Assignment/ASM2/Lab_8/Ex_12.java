package Assignment.ASM2.Lab_8;

import java.util.Arrays;
import java.util.List;

class DataAnalysisException_Ex12 extends Exception {
    public DataAnalysisException_Ex12(String message) {
        super(message);
    }
}

class DataAnalyzer{
    public void analyeData(List<Integer> data) throws DataAnalysisException_Ex12 {
        if(data == null || data.isEmpty()){
            throw new DataAnalysisException_Ex12("Data is null or empty");
        }
        for(Integer value : data){
            if(value == null){
                throw new DataAnalysisException_Ex12("Value is null");
            }
            System.out.println("Analizing " + value);
        }
        System.out.println("Data analyzed successfully");
    }
}
public class Ex_12 {
    public static void main(String[] args) {
        DataAnalyzer da = new DataAnalyzer();
        List<Integer> data = Arrays.asList(1,2,3,4,5);
        try{
            da.analyeData(data);
            da.analyeData(null);
        }catch (DataAnalysisException_Ex12 e){
            System.out.println(e.getMessage());
        }
    }
}
