//If-Else and Switch Case
/*
* Boolean Data Type:
*   + Toán tử so sánh
*   +
* */

package Lecture.Buoi_2;

import java.util.Scanner;

public class Java_Flow_Control {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int dayOfWeek = sc.nextInt();
        System.out.println(checkDayOfWeek(dayOfWeek));

//        int num1 = (int) (Math.random()*100);
//        int num2 = (int) (Math.random()*100);
//
//        System.out.println("Sum of " + num1 + " and " + num2 + " is ");
//
//        int sum = num1 + num2;
//
//        int answer = sc.nextInt();
//
//        if(sum != answer){
//            System.out.println("Sai kìa");
//        }
//        System.out.println("Kết quả của bạn đúng");

//        System.out.println("Enter year: ");
//        int year = sc.nextInt();
//
//        boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
//        if(isLeapYear){
//            System.out.println("Leap Year");
//        }
//        else{
//            System.out.println("Not a Leap Year");
//        }



    }
    public static String checkDayOfWeek(int day) {
        String dayName;
        switch (day) {
            case 1 -> dayName = "Monday";
            case 2 -> dayName = "Tuesday";
            case 3 -> dayName = "Wednesday";
            case 4 -> dayName = "Thursday";
            case 5 -> dayName = "Friday";
            case 6 -> dayName = "Saturday";
            case 7 -> dayName = "Sunday";
            default -> dayName = "Error";
        }
        return dayName;
    }
}
