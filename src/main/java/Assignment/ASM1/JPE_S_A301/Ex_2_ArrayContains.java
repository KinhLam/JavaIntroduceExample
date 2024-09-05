/*In project “Java.S.A201” create a new package called exercise2, after that create a class named
ArrayContains:
         Enter length and elements of a string array “stringArray”
         Require to enter a string variable “sValue”
         Print “Contained” if Array contains “sValue”, or “No Contain” otherwise.*/


package Assignment.ASM1.JPE_S_A301;

import java.util.Scanner;

public class Ex_2_ArrayContains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn nhập bao nhiêu phần tử vào mảng: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ: " + i);
            arr[i] = sc.nextLine();
        }

        System.out.println("Nhập phần tử để kiểm tra: ");
        String value = sc.nextLine();

        //Hàm ktra chuỗi có nằm ở trong mảng không?
        boolean constains = false;
        for (String element : arr) {
            if (element.equals(value)) {
                constains = true;
                break;
            }
        }

        if (constains) {
            System.out.println("Contained");
        } else {
            System.out.println("No Contain");
        }
    }
}
