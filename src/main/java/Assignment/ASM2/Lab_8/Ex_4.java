package Assignment.ASM2.Lab_8;
class InvalidDataException extends Exception{
    InvalidDataException(String s){
        super(s);
    }
}

class DataValidator{
    public void validateDate(String data) throws InvalidDataException{
        if(data == null || data.isEmpty()){
            throw new InvalidDataException("Invalid data");
        }
    }
}
public class Ex_4 {
    public static void main(String[] args) {
        DataValidator validator = new DataValidator();
        try{
            validator.validateDate("");
        }catch (InvalidDataException e){
            System.out.println(e.getMessage());
        }
    }
}
