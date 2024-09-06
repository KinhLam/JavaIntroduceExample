package Assignment.ASM1.JPE_S_A201;

import java.util.Scanner;

public class Ex_4_CylinderComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius, height, surfaceArea, baseArea, volume;

        System.out.print("Nhập bán kính hình trụ: ");
        radius = sc.nextDouble();

        System.out.print("Nhập chiều cao hình trụ: ");
        height = sc.nextDouble();

        // Calculate the base area (πr^2)
        baseArea = Math.PI * radius * radius;

        // Calculate the surface area (2πr(h + r))
        surfaceArea = 2 * Math.PI * radius * (height + radius);

        // Calculate the volume (πr^2h)
        volume = Math.PI * radius * radius * height;

        // Output the results
        System.out.println("Diện tích cơ sở là: " + baseArea);
        System.out.println("Diện tích bề mặt là: " + surfaceArea);
        System.out.println("Khối lượng: " + volume);
    }
}
