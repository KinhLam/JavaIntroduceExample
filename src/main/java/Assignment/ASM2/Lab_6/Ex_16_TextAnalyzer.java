package Assignment.ASM2.Lab_6;

public class Ex_16_TextAnalyzer {
    public String reverseWordOrder(String text) {
        String[] words = text.split("\\s+");
        StringBuilder reversedText = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedText.append(words[i]).append(" ");
        }
        return reversedText.toString().trim();
    }

    public static void main(String[] args) {
        Ex_16_TextAnalyzer obj = new Ex_16_TextAnalyzer();
        System.out.println(obj.reverseWordOrder("Hello World"));
    }
}
