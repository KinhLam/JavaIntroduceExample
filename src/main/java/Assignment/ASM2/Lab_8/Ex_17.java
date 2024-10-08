package Assignment.ASM2.Lab_8;
class DataTransformationException_Ex17 extends Exception {
    public DataTransformationException_Ex17(String message) {
        super(message);
    }
}

class DataTransfomer_Ex17{
    public String transformData(String data) throws DataTransformationException_Ex17 {
        if(data == null || data.isEmpty()){
            throw new DataTransformationException_Ex17("Empty data");
        }
        return data;
    }
}
public class Ex_17 {
    public static void main(String[] args) {
        DataTransfomer_Ex17 trans = new DataTransfomer_Ex17();
        try{
            System.out.println("Transform Data: " + trans.transformData("Hello"));
            trans.transformData(null);
        }catch (DataTransformationException_Ex17 e){
            System.out.println(e.getMessage());
        }
    }
}
