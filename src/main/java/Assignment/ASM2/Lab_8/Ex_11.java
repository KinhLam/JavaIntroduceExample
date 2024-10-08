package Assignment.ASM2.Lab_8;
class InvalidTemperatureException_Ex11 extends Exception {
    public InvalidTemperatureException_Ex11(String message) {
        super(message);
    }
}

class TemperatureConverter{
    public double convertToFahrenheit(double celsius) throws InvalidTemperatureException_Ex11 {
        if (celsius < -273.15) {
            throw new InvalidTemperatureException_Ex11("Temperature below absolute zero is not valid.");
        }
        return (celsius * 9/5) + 32;
    }
}
public class Ex_11 {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        try {
            System.out.println("25°C to Fahrenheit: " + converter.convertToFahrenheit(25));
            System.out.println("-300°C to Fahrenheit: " + converter.convertToFahrenheit(-300));
        } catch (InvalidTemperatureException_Ex11 e) {
            System.out.println(e.getMessage());
        }
    }
}
