package Assignment.ASM2.Lab_6;

public class Ex_19_StringJoiner {
    public String joinString(String[] strings, String delimiter){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strings.length; i++){
            sb.append(strings[i]);
            if(i < strings.length - 1){
                sb.append(delimiter);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Ex_19_StringJoiner joiner = new Ex_19_StringJoiner();
        String[] words = {"Java", "C#", "Angular"};
        System.out.println(joiner.joinString(words, ","));
    }
}