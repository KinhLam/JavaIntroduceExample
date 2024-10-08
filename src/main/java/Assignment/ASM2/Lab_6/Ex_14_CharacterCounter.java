package Assignment.ASM2.Lab_6;

public class Ex_14_CharacterCounter {
    public int countCharacterOccurrences(String text, char character){
        int count = 0;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == character){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Ex_14_CharacterCounter counter = new Ex_14_CharacterCounter();
        String text = "Java World";
        System.out.println(counter.countCharacterOccurrences(text, 'a'));
    }
}
