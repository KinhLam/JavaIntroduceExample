package Assignment.ASM2.Lab_6;

public class Ex_12_SubstringExtractor {
    public String compressString(String text, int start, int end) {
        return text.substring(start, end);
    }

    public static void main(String[] args) {
        Ex_12_SubstringExtractor ex = new Ex_12_SubstringExtractor();
        String text = "Hello, World";
        System.out.println(ex.compressString(text, 0, 5));
    }
}
