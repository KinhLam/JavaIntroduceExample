package Assignment.ASM2.Lab_6;

public class Ex_3_NameInitialsGenerator {
    public String generateInitials(String fullName){
        String[] names = fullName.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String name : names){
            sb.append(name.charAt(0));
        }
        return sb.toString().toUpperCase();
    }

    public static void main(String[] args) {
        Ex_3_NameInitialsGenerator gen = new Ex_3_NameInitialsGenerator();
        System.out.println(gen.generateInitials("John Doe"));

    }
}
