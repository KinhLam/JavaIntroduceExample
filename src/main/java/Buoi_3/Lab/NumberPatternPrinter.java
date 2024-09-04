package Buoi_3.Lab;

import java.util.Scanner;

public class NumberPatternPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        numberPattern(n);
    }

    public static void numberPattern(int numbers){
        int num = 1;
        //Xác định số lượng cột
        for(int i = 1; i <= numbers; i++){
            //Xử lý dữ liệu bên trong cột
            for(int j = 1; j <= i; j++){
                System.out.print(num + " ");
                //Tăng giá trị của num lên 1
                num++;
            }

            System.out.println();
        }
    }
}
