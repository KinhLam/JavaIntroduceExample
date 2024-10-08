package Assignment.ASM2.Lab_8;

class DataValidationException extends Exception {
    public DataValidationException(String message) {
        super(message);
    }
}

class DataValidator_Ex26{
    public void validateData(String data) throws DataValidationException {
        if (data == null || !data.matches("[a-zA-Z]+")) {
            throw new DataValidationException("Data is not in the expected format.");
        }
        System.out.println("Data is valid.");
    }
}
public class Ex_26 {
    public static void main(String[] args) {
        DataValidator_Ex26 dv = new DataValidator_Ex26();
        try {
            dv.validateData("1234");
        }catch (DataValidationException e) {
            System.out.println(e.getMessage());
        }
    }
}
