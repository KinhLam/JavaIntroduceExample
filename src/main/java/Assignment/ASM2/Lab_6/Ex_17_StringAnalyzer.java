package Assignment.ASM2.Lab_6;

public class Ex_17_StringAnalyzer {
    public String findLongestCommonSubstring(String text1, String text2) {
        String longestCommon = "";
        for (int i = 0; i < text1.length(); i++) {
            for (int j = i + 1; j <= text1.length(); j++) {
                String subStr = text1.substring(i, j);
                if (text2.contains(subStr) && subStr.length() > longestCommon.length()) {
                    longestCommon = subStr;
                }
            }
        }
        return longestCommon;
    }

    public static void main(String[] args) {
        Ex_17_StringAnalyzer obj = new Ex_17_StringAnalyzer();
        System.out.println(obj.findLongestCommonSubstring("helloworld", "javabeginner"));
    }
}
