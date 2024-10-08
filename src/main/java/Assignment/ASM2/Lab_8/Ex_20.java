package Assignment.ASM2.Lab_8;
class InputParsingException extends Exception{
    public InputParsingException(String s){
        super(s);
    }
}

class InputParser{
    public int parseInput(String input) throws InputParsingException{
        if(input == null || input.isEmpty()){
            throw new InputParsingException("Input is empty");
        }
        try {
            return Integer.parseInt(input);
        }catch(NumberFormatException e){
            throw new InputParsingException("Invalid input");
        }
    }
}
public class Ex_20 {
    public static void main(String[] args){
        InputParser inp = new InputParser();
        try {
            System.out.println("Parsed Input: " + inp.parseInput("123"));
            inp.parseInput("abc");
        }catch (InputParsingException e){
            System.out.println(e.getMessage());
        }
    }
}
