package Assignment.ASM2.Lab_6;

public class Ex_5_StringReverser {
    public String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static void main(String[] args) {
        Ex_5_StringReverser reverser = new Ex_5_StringReverser();
        System.out.println(reverser.reverseString("Hello World"));
    }
}
