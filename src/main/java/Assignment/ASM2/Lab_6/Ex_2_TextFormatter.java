package Assignment.ASM2.Lab_6;

public class Ex_2_TextFormatter {
    public String formatText(String text) {
        return text.trim().toLowerCase().replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        Ex_2_TextFormatter formatter = new Ex_2_TextFormatter();
        System.out.println(formatter.formatText("   Hello World!    "));
    }
}
