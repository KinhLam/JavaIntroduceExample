package Assignment.ASM2.Lab_8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class DataExportException extends Exception {
    public DataExportException(String message) {
        super(message);
    }
}

class DataExporter{
    public void exportData(List<String> data, String filePath)throws DataExportException{
        File file = new File(filePath);
        if (!file.canWrite()){
            throw new DataExportException("Can't write to file");
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for(String s : data){
                writer.write(s);
                writer.newLine();
            }
            System.out.println("Data exported successfully" + filePath);
        }catch (IOException e){
            throw new DataExportException("Error export to file");
        }
    }
}
public class Ex_29 {
    public static void main(String[] args) {
        DataExporter exporter = new DataExporter();
        try {
            exporter.exportData(Arrays.asList("Hus", "Khao", "Conawr"), "src/main/java/Lab_8/testfile.txt");
        }catch (DataExportException e){
            System.out.println(e.getMessage());
        }
    }
}
