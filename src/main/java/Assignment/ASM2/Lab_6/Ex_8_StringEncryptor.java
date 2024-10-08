package Assignment.ASM2.Lab_6;

public class Ex_8_StringEncryptor {
    public String encrypt(String text, int shift) {
        StringBuilder encryptedText = new StringBuilder();
        for(char c : text.toCharArray()) {
            encryptedText.append((char) (c + shift));
        }
        return encryptedText.toString();
    }

    public String decrypt(String text, int shift) {
        StringBuilder dencryptedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            dencryptedText.append((char) (c - shift));
        }
        return dencryptedText.toString();
    }

    public static void main(String[] args) {
        Ex_8_StringEncryptor ex = new Ex_8_StringEncryptor();
        String text = "Hello";
        int shift = 3;
        String encryptedText = ex.encrypt(text, shift);
        System.out.println(encryptedText);
        System.out.println(ex.decrypt(encryptedText, shift));
    }
}
