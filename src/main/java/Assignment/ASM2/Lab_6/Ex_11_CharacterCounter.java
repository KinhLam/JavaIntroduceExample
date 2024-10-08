package Assignment.ASM2.Lab_6;

public class Ex_11_CharacterCounter {
    public int countCharacters(String text, char charater) {
        int count = 0;
        for(char c : text.toCharArray()) {
            if(c == charater){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Ex_11_CharacterCounter counter = new Ex_11_CharacterCounter();
        System.out.println(counter.countCharacters("Hello World", 'H'));
    }
}
