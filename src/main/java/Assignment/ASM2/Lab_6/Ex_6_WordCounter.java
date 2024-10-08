package Assignment.ASM2.Lab_6;

public class Ex_6_WordCounter {
    public int countWords(String sentence){
        if(sentence == null || sentence.trim().isEmpty()){
            return 0;
        }

        String[] words = sentence.split(" ");
        return words.length;
    }

    public static void main(String[] args) {
        Ex_6_WordCounter ex = new Ex_6_WordCounter();
        System.out.println(ex.countWords("Hello World"));
    }
}
