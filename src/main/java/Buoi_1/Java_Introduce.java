package Buoi_1;

import java.util.Scanner;

public class Java_Introduce {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        radiusJava();
    }

    public static void radiusJava(){
        Scanner sc = new Scanner(System.in);
        double a, b;
        a = sc.nextDouble();
        b = sc.nextDouble();
        double c = 3.14;

        System.out.println("Area of radius is "+(a*b*c));
    }
}
