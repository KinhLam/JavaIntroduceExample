package Assignment.ASM2.Lab_8;
class DivideByZeroException extends Exception{
    public DivideByZeroException(String message){
        super(message);
    }
}

class Caculator{
    public int divide(int num1, int num2) throws DivideByZeroException{
        if(num2 == 0){
            throw new DivideByZeroException("Divide by zero");
        }
        return num1 / num2;
    }
}

public class Ex_1 {
    public static void main(String[] args){
        Caculator c = new Caculator();
        try{
            System.out.println(c.divide(10, 2));
            System.out.println(c.divide(10, 0));
        }catch (DivideByZeroException e){
            System.out.println(e.getMessage());
        }
    }
}
